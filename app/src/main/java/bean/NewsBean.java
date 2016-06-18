package bean;

import java.util.List;

/**
 * Created by Administrator on 16-6-18.
 */
public class NewsBean{



    private List<NewsContent> T1348647853363;

    public NewsBean(){
    }

    public NewsBean(List<NewsContent> t1348647853363){
        T1348647853363 = t1348647853363;
    }

    public List<NewsContent> getT1348647853363(){
        return T1348647853363;
    }

    public void setT1348647853363(List<NewsContent> t1348647853363){
        T1348647853363 = t1348647853363;
    }
}
