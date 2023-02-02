//193
public class func{
public void doInBackground(ApiPacket... params){
        url = new URL(getString(R.string.djImageApiURL) + pack.main.dj.id);
        HttpURLConnection conn = (HttpURLConnection) url
            .openConnection();
        conn.setDoInput(true);
        conn.connect();
        InputStream is = conn.getInputStream();
        image = BitmapFactory.decodeStream(is);
}
}
