//289
public class func{
public void open(String base,FormValues fv){
        if (fv != null) {
            String url = base + "?" + fv.queryString();
            conn = (HttpURLConnection) new URL(url).openConnection();
        } else {
            conn = (HttpURLConnection) new URL(base).openConnection();
        }
}
}
