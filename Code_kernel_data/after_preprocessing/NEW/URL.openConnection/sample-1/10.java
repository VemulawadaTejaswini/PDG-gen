//10
public class func{
public void getImageBitmap(String url){
            URLConnection conn = new URL(url).openConnection(); conn.connect();
            is = conn.getInputStream();
            bis = new BufferedInputStream(is, 8092);
            bm = BitmapFactory.decodeStream(bis);
            if(bm==null) throw new Exception("couldn't decode bitmap stream");
            imageCache.put(url,bm);
}
}
