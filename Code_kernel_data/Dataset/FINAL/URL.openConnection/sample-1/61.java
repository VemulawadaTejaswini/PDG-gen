public class func{
public void GetBitmap(String imageUrl){
        URL url = new URL(imageUrl);   
        URLConnection conn=url.openConnection();
        InputStream is = conn.getInputStream();   
        mBitmap = BitmapFactory.decodeStream(is);   
}
}
