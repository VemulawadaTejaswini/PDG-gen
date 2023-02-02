//229
public class func{
public void doInBackground(Void... params){
            url = new URL(mImageURL);
            mBitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
}
}
