//59
public class func{
	public void GetUrlDrawable(String url){
      URL aryURI=new URL(url);
      URLConnection conn=aryURI.openConnection();
      InputStream is=conn.getInputStream();
      Bitmap bmp=BitmapFactory.decodeStream(is);
      return new BitmapDrawable(bmp);
      Log.e("ERROR", "urlImage2Drawable���������ì�£��imageUrl��" + url, e);
}
}
