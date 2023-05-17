//0
public class func{
public void fetchImage(URL url){
            URLConnection conn = url.openConnection();
            conn.connect();
            is = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is, 16384);
                Bitmap bitmap = BitmapFactory.decodeStream(bis);
                bis.close();
}
}
