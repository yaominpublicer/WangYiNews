package httptools;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import bean.NewsBean;
import bean.NewsContent;

/**
 * Created by Administrator on 16-6-18.
 */
public class HttpUtils{

    public static String downLoadJSONString(String jsonString){

            HttpURLConnection connection=null;
        try{
            URL url=new URL(jsonString);

            connection= (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(5*1000);
            connection.setConnectTimeout(5*1000);
            connection.connect();

            if(connection.getResponseCode() == 200){
                InputStream is = connection.getInputStream();
                BufferedReader bf = new BufferedReader(new InputStreamReader(is));
                String line;
                StringBuffer strbuffer = new StringBuffer();
                while((line = bf.readLine()) != null){
                    strbuffer.append(line);
                }
                String returnedString = strbuffer.toString();
                return returnedString;
            }

        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }






    public static NewsBean parserJsonToNewSBean(String jsonStr){
        List<NewsContent> contentsList=new ArrayList<>();
        try{
            JSONObject newsObject=new JSONObject(jsonStr);
            JSONArray contetnJsonArray=newsObject.getJSONArray("T1348647853363");

            for(int i=0;i<contetnJsonArray.length();i++){

                NewsContent newsContent=new NewsContent();

                JSONObject subContetObject=contetnJsonArray.getJSONObject(i);

                //判断是否有ads
                if(subContetObject.has("ads")){
                    List<NewsContent.AdsBean> adsBeenList = new ArrayList<>();
                    JSONArray adsArray = subContetObject.getJSONArray("ads");
                    for(int j = 0; j < adsArray.length(); j++){
                        NewsContent.AdsBean adsBean = new NewsContent.AdsBean();
                        JSONObject adsobj = adsArray.getJSONObject(i);
                        String title = adsobj.getString("title");
                        String imgsrc = adsobj.getString("imgsrc");
                        adsBean.setTitle(title);
                        adsBean.setImgsrc(imgsrc);
                        adsBeenList.add(adsBean);
                    }
                    //有则把adsbeanlist 设置到newscontent
                    newsContent.setAds(adsBeenList);
                }

                //判断是否有imgextra
                if(subContetObject.has("imgextra")){
                    List<NewsContent.ImgextraBean> imgxtraBeanList = new ArrayList<>();
                    JSONArray imgextraArray = subContetObject.getJSONArray("imgextra");
                    for(int k = 0; k < imgextraArray.length(); k++){
                        NewsContent.ImgextraBean imgextraBean = new NewsContent.ImgextraBean();
                        JSONObject imgextraObj = imgextraArray.getJSONObject(k);
                        String imgsrc = imgextraObj.getString("imgsrc");
                        imgextraBean.setImgsrc(imgsrc);
                        imgxtraBeanList.add(imgextraBean);
                    }
                    newsContent.setImgextra(imgxtraBeanList);
                }



                //解析普通项（一定要解析到）
                String ltitle=subContetObject.getString("ltitle");
                String digest=subContetObject.getString("digest");
                String imgsrc=subContetObject.getString("imgsrc");

                newsContent.setLtitle(ltitle);
                newsContent.setDigest(digest);
                newsContent.setImgsrc(imgsrc);


                contentsList.add(newsContent);

                NewsBean newsbean=new NewsBean(contentsList);
                return newsbean;

            }


        }catch(JSONException e){
            e.printStackTrace();
        }
        return null;
    }



}
