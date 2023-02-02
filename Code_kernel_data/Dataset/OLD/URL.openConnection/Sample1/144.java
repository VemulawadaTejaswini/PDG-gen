//143
public class func{
	public void doInBackground(Uri... params){
                Bitmap bitmap = WordPress.getBitmapCache().getBitmap(uri);
                if (bitmap == null) {
                    URL url = new URL(uri);
                    bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                    WordPress.getBitmapCache().put(uri, bitmap);
                }
}
}
