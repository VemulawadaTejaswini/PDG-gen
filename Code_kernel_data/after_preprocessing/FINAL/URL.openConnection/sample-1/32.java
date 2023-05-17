public class func{
public void loadImageFromUrl(String url){
      aURL = new URL(url);
      URLConnection conn = aURL.openConnection(); 
            conn.connect(); 
            InputStream is = conn.getInputStream(); 
            BufferedInputStream bis = new BufferedInputStream(is); 
            Bitmap bm = BitmapFactory.decodeStream(bis); 
            bis.close(); 
}
}
