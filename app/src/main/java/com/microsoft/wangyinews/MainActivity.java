package com.microsoft.wangyinews;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ListView;

import java.util.List;

import adapter.Adapter_listview;
import bean.NewsBean;
import bean.NewsContent;
import constante.Constante;
import httptools.HttpUtils;

public class MainActivity extends BaseActivity{

    private ListView listview;
    private Handler myHandler=new Handler(){

        @Override
        public void handleMessage(Message msg){
            super.handleMessage(msg);

            switch(msg.what){
                case Constante.PARSER_SUCCESS:
                    NewsBean bean= (NewsBean) msg.obj;
                    List<NewsContent> list=bean.getT1348647853363();
                    Adapter_listview adapterListview=new Adapter_listview(MainActivity.this,getLayoutInflater(),list);
                listview.setAdapter(adapterListview);

                break;
                case Constante.PARSER_FAILED:

                    break;
            }



        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);

        initData(Constante.newsUrl);
    }



    private void initData(final String newsUrl){


        new Thread(new Runnable(){
            @Override
            public void run(){
                String jsonString = HttpUtils.downLoadJSONString(newsUrl);
                if(jsonString == null || jsonString.isEmpty()){
                    try{
                        throw new Exception("----jsonstring----is----null----");
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                NewsBean newsBean = HttpUtils.parserJsonToNewSBean(jsonString);
                if(newsBean != null){
                    Message message = Message.obtain();
                    message.what = Constante.PARSER_SUCCESS;
                    message.obj = newsBean;
                    myHandler.sendMessage(message);
                }else{
                    myHandler.sendEmptyMessage(Constante.PARSER_FAILED);
                }
            }
        }).start();



    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        myHandler.removeCallbacks(null);
    }
}
