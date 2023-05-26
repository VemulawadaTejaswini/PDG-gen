public class func{
public void doInBackground(Void... params){
                    URL imageUrl = new URL(mUrl);
                    HttpURLConnection connection = (HttpURLConnection) imageUrl.openConnection();
                    connection.setConnectTimeout(TIMEOUT);
                    connection.setReadTimeout(TIMEOUT);
                    connection.setInstanceFollowRedirects(true);
                    InputStream inputStream = connection.getInputStream();
}
}
