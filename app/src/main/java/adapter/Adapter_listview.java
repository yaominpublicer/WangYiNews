package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import bean.NewsContent;

/**
 * Created by Administrator on 16-6-18.
 */
public class Adapter_listview extends BaseAdapter{

    private static final int AD=0;
    private static final int GENERAL=1;
    private static final int SET=2;

    private Context context;
    private LayoutInflater inflater;
    private List<NewsContent> list;
    public Adapter_listview(Context context, LayoutInflater inflater,List<NewsContent> list){

        this.context=context;
        this.inflater=inflater;
        this.list=list;

    }



    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public Object getItem(int position){
        return list.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public int getItemViewType(int position){

        NewsContent newsContent=list.get(position);

        if(newsContent.getAds() != null){

            return AD;
        }else if(newsContent.getImgextra() != null){
            return SET;
        }else {

            return GENERAL;
        }



    }

    @Override
    public int getViewTypeCount(){

        return 3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

















        return null;
    }











}
