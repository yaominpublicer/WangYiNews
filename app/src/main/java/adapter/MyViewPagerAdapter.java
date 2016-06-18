package adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import bean.NewsContent;

/**
 * Created by Administrator on 16-6-18.
 */
public class MyViewPagerAdapter extends PagerAdapter{

    private  Context context;
    private  List<NewsContent.AdsBean> list;

    public MyViewPagerAdapter(Context context, List<NewsContent.AdsBean> list){


        this.context=context;
        this.list=list;

    }
    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        ImageView img=new ImageView(context);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(context).load(list.get(position).getImgsrc()).into(img);
        container.addView(img);

        return img;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
       container.removeView((ImageView)object);
    }
}
