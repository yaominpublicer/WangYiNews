package adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.microsoft.wangyinews.R;

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

        AdViewHoler adViewHoler=null;
        GeneralViewHoler generalViewHoler=null;
        PhotoSetViewHoler setViewHoler=null;

        int itemType=getItemViewType(position);
        if(convertView ==null){
            switch(itemType){
                case AD:
                    convertView = inflater.inflate(R.layout.viewpager_layout, parent, false);
                    adViewHoler = new AdViewHoler();
                    adViewHoler.title = (TextView) convertView.findViewById(R.id.title_viewpager);
                    adViewHoler.viewPager = (ViewPager) convertView.findViewById(R.id.ad_viewpager);
                    convertView.setTag(adViewHoler);
                    break;
                case GENERAL:
                    convertView = inflater.inflate(R.layout.generalview_layout, parent, false);
                    generalViewHoler = new GeneralViewHoler();
                    generalViewHoler.img = (ImageView) convertView.findViewById(R.id.img_generalview);
                    generalViewHoler.title = (TextView) convertView.findViewById(R.id.title_generalview);
                    generalViewHoler.content = (TextView) convertView.findViewById(R.id.content_generalview);
                    convertView.setTag(generalViewHoler);
                    break;
                case SET:
                    convertView = inflater.inflate(R.layout.photeset_layout, parent, false);
                    setViewHoler = new PhotoSetViewHoler();
                    setViewHoler.title = (TextView) convertView.findViewById(R.id.title_photoset);
                    setViewHoler.img01 = ((ImageView) convertView.findViewById(R.id.img01_photoset));
                    setViewHoler.img02 = ((ImageView) convertView.findViewById(R.id.img02_photoset));
                    setViewHoler.img03 = ((ImageView) convertView.findViewById(R.id.img03_photoset));
                    break;
            }
        }else {
            switch(itemType){
                case AD:
                    adViewHoler = (AdViewHoler) convertView.getTag();
                    break;
                case GENERAL:
                    generalViewHoler = (GeneralViewHoler) convertView.getTag();
                    break;
                case SET:
                    setViewHoler = (PhotoSetViewHoler) convertView.getTag();
                    break;
            }

        }



        switch(itemType){
            case AD:

                 final NewsContent news=list.get(position);
                adViewHoler.title.setText( news.getAds().get(0).getTitle());
                MyViewPagerAdapter adapter=new MyViewPagerAdapter(context,news.getAds());

                adViewHoler.viewPager.setAdapter(adapter);
                final AdViewHoler finalAdViewHoler = adViewHoler;
                final AdViewHoler finalAdViewHoler1 = adViewHoler;
                adViewHoler.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){
                    }

                    @Override
                    public void onPageSelected(int position){

                        finalAdViewHoler1.title.setText(news.getAds().get(position).getTitle());


                    }

                    @Override
                    public void onPageScrollStateChanged(int state){
                    }
                });


                break;
            case GENERAL:
                Glide.with(context).load(list.get(position).getImgsrc()).into(generalViewHoler.img);
                generalViewHoler.title.setText(list.get(position).getTitle());
                generalViewHoler.content.setText(list.get(position).getDigest());

                break;
            case SET:
                Log.e("getView: ", "----adapter----position"+position);
                setViewHoler.title.setText(list.get(position).getTitle());
                Log.e("getView: ", "----adapter----title"+list.get(position).getTitle());
                Glide.with(context).load(list.get(position).getImgsrc()).into(setViewHoler.img01);
                Glide.with(context).load(list.get(position).getImgextra().get(0).getImgsrc()).into(setViewHoler.img02);
                Glide.with(context).load(list.get(position).getImgextra().get(1).getImgsrc()).into(setViewHoler.img03);
                break;
        }













        return convertView;
    }



    class AdViewHoler{

        ViewPager viewPager;
        TextView title;

    }
    class GeneralViewHoler{
        ImageView img;
        TextView title;
        TextView content;

    }
    class PhotoSetViewHoler{

        TextView title;
        ImageView img01;
        ImageView img02;
        ImageView img03;

    }








}
