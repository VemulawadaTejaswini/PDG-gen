public class func{
public void doInBackground(Void... params){
        URL url = new URL(image_url);
        bmp = BitmapFactory.decodeStream(url.openConnection()
            .getInputStream());
}
}
