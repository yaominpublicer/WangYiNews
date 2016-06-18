package bean;

import java.util.List;

/**
 * Created by Administrator on 16-6-18.
 */
public class NewsContent{

    /**
     * postid : PHOT22NUF000100A
     * hasCover : false
     * hasHead : 1
     * replyCount : 2456
     * hasImg : 1
     * digest :
     * hasIcon : true
     * docid : 9IG74V5H00963VRO_BPR58PDTliushuqiupdateDoc
     * title : 工程师忘关门 机器人出逃上街堵路
     * order : 1
     * priority : 254
     * lmodify : 2016-06-18 09:09:28
     * boardid : photoview_bbs
     * ads : [{"title":"一周精选:印尼多只巨头鲸海滩搁浅","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/bfcb327bc1304a048ec5e8247853269420160618071133.jpeg","subtitle":"","url":"19BR0001|2187165"},{"title":"大妈汽车后备箱上烧烤 1小时烤熟","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/88c3a573bb2644a584fe910acbdbcd8f20160618085640.jpeg","subtitle":"","url":"00AP0001|2187214"},{"title":"奥兰多民众摆放十字架 悼念遇难者","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/217352782c224f08b2a19c9ecbc392c720160618081951.jpeg","subtitle":"","url":"00AO0001|2187211"},{"title":"西安拆除农家乐建筑 整治河道","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/047f01994f65464486a0b8bca9d0b7ff20160618080853.jpeg","subtitle":"","url":"00AP0001|2187209"},{"title":"西安南郊发生爆炸 现场火光冲天","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/306dc344ff41407ab862cdbb9314d8d020160618074546.jpeg","subtitle":"","url":"00AP0001|2187198"}]
     * photosetID : 00AO0001|2187215
     * template : normal1
     * votecount : 2169
     * skipID : 00AO0001|2187215
     * alias : Top News
     * skipType : photoset
     * cid : C1348646712614
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://cms-bucket.nosdn.127.net/485418b379c84eda86d4f59705ac983520160618091034.jpeg"},{"imgsrc":"http://cms-bucket.nosdn.127.net/d160ce8c4763482da867dc9745168a5820160618091036.jpeg"}]
     * source : 网易原创
     * ename : iosnews
     * imgsrc : http://cms-bucket.nosdn.127.net/b36e082032404af6b3683d7b68b0a3f920160618091033.jpeg
     * tname : 头条
     * ptime : 2016-06-18 09:09:28
     */

    private String postid;
    private boolean hasCover;
    private int hasHead;
    private int replyCount;
    private int hasImg;
    private String digest;
    private boolean hasIcon;
    private String docid;
    private String title;
    private int order;
    private int priority;
    private String lmodify;
    private String boardid;
    private String photosetID;
    private String template;
    private int votecount;
    private String skipID;
    private String alias;
    private String skipType;
    private String cid;
    private int hasAD;
    private String source;
    private String ename;
    private String imgsrc;
    private String tname;
    private String ptime;
    /**
     * title : 一周精选:印尼多只巨头鲸海滩搁浅
     * tag : photoset
     * imgsrc : http://cms-bucket.nosdn.127.net/bfcb327bc1304a048ec5e8247853269420160618071133.jpeg
     * subtitle :
     * url : 19BR0001|2187165
     */

    private List<AdsBean> ads;
    /**
     * imgsrc : http://cms-bucket.nosdn.127.net/485418b379c84eda86d4f59705ac983520160618091034.jpeg
     */

    private List<ImgextraBean> imgextra;
    /**
     * url_3w : http://news.163.com/16/0618/07/BPQUL6PM00014JB6.html
     * ltitle : 习近平凭吊中国驻南联盟被炸使馆烈士
     * url : http://3g.163.com/news/16/0618/07/BPQUL6PM00014JB6.html
     * specialID : S1466059011356
     * subtitle :
     */

    private String url_3w;
    private String ltitle;
    private String url;
    private String specialID;
    private String subtitle;

    public String getPostid(){
        return postid;
    }

    public void setPostid(String postid){
        this.postid = postid;
    }

    public boolean isHasCover(){
        return hasCover;
    }

    public void setHasCover(boolean hasCover){
        this.hasCover = hasCover;
    }

    public int getHasHead(){
        return hasHead;
    }

    public void setHasHead(int hasHead){
        this.hasHead = hasHead;
    }

    public int getReplyCount(){
        return replyCount;
    }

    public void setReplyCount(int replyCount){
        this.replyCount = replyCount;
    }

    public int getHasImg(){
        return hasImg;
    }

    public void setHasImg(int hasImg){
        this.hasImg = hasImg;
    }

    public String getDigest(){
        return digest;
    }

    public void setDigest(String digest){
        this.digest = digest;
    }

    public boolean isHasIcon(){
        return hasIcon;
    }

    public void setHasIcon(boolean hasIcon){
        this.hasIcon = hasIcon;
    }

    public String getDocid(){
        return docid;
    }

    public void setDocid(String docid){
        this.docid = docid;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    public int getPriority(){
        return priority;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public String getLmodify(){
        return lmodify;
    }

    public void setLmodify(String lmodify){
        this.lmodify = lmodify;
    }

    public String getBoardid(){
        return boardid;
    }

    public void setBoardid(String boardid){
        this.boardid = boardid;
    }

    public String getPhotosetID(){
        return photosetID;
    }

    public void setPhotosetID(String photosetID){
        this.photosetID = photosetID;
    }

    public String getTemplate(){
        return template;
    }

    public void setTemplate(String template){
        this.template = template;
    }

    public int getVotecount(){
        return votecount;
    }

    public void setVotecount(int votecount){
        this.votecount = votecount;
    }

    public String getSkipID(){
        return skipID;
    }

    public void setSkipID(String skipID){
        this.skipID = skipID;
    }

    public String getAlias(){
        return alias;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public String getSkipType(){
        return skipType;
    }

    public void setSkipType(String skipType){
        this.skipType = skipType;
    }

    public String getCid(){
        return cid;
    }

    public void setCid(String cid){
        this.cid = cid;
    }

    public int getHasAD(){
        return hasAD;
    }

    public void setHasAD(int hasAD){
        this.hasAD = hasAD;
    }

    public String getSource(){
        return source;
    }

    public void setSource(String source){
        this.source = source;
    }

    public String getEname(){
        return ename;
    }

    public void setEname(String ename){
        this.ename = ename;
    }

    public String getImgsrc(){
        return imgsrc;
    }

    public void setImgsrc(String imgsrc){
        this.imgsrc = imgsrc;
    }

    public String getTname(){
        return tname;
    }

    public void setTname(String tname){
        this.tname = tname;
    }

    public String getPtime(){
        return ptime;
    }

    public void setPtime(String ptime){
        this.ptime = ptime;
    }

    public List<AdsBean> getAds(){
        return ads;
    }

    public void setAds(List<AdsBean> ads){
        this.ads = ads;
    }

    public List<ImgextraBean> getImgextra(){
        return imgextra;
    }

    public void setImgextra(List<ImgextraBean> imgextra){
        this.imgextra = imgextra;
    }

    public String getUrl_3w(){
        return url_3w;
    }

    public void setUrl_3w(String url_3w){
        this.url_3w = url_3w;
    }

    public String getLtitle(){
        return ltitle;
    }

    public void setLtitle(String ltitle){
        this.ltitle = ltitle;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getSpecialID(){
        return specialID;
    }

    public void setSpecialID(String specialID){
        this.specialID = specialID;
    }

    public String getSubtitle(){
        return subtitle;
    }

    public void setSubtitle(String subtitle){
        this.subtitle = subtitle;
    }

    public static class AdsBean{
        private String title;
        private String tag;
        private String imgsrc;
        private String subtitle;
        private String url;

        public String getTitle(){
            return title;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public String getTag(){
            return tag;
        }

        public void setTag(String tag){
            this.tag = tag;
        }

        public String getImgsrc(){
            return imgsrc;
        }

        public void setImgsrc(String imgsrc){
            this.imgsrc = imgsrc;
        }

        public String getSubtitle(){
            return subtitle;
        }

        public void setSubtitle(String subtitle){
            this.subtitle = subtitle;
        }

        public String getUrl(){
            return url;
        }

        public void setUrl(String url){
            this.url = url;
        }
    }

    public static class ImgextraBean{
        private String imgsrc;

        public String getImgsrc(){
            return imgsrc;
        }

        public void setImgsrc(String imgsrc){
            this.imgsrc = imgsrc;
        }
    }




}
