public class func{
    public void setupConnection(Context context,URL url,ConnectionCallback callback){
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn = (HttpURLConnection)url.openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.setDoInput(true);
        addAuthentication(context, conn);
    }
}