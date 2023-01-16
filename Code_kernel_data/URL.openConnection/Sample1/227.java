//226
public class func{
	public void doInBackground(String... uris){
              URL url = new URL(uris[0]);
              Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
}
}
