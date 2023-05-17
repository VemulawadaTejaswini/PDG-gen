public class func{
public void isUrlReachable(String url){
            downloadUrl = new URL(url);
            is = downloadUrl.openStream();
            dataInputStream = new DataInputStream(new BufferedInputStream(is));
            while (dataInputStream.readLine() != null) {
                return true;
            }
}
}
