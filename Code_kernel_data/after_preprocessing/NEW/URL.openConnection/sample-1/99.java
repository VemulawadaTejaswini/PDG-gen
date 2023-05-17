//99
public class func{
public void findAddress(String address){
        URL url = new URL(geocoder.encode(address));
        URLConnection connection = url.openConnection();
        String content = Streams.readString(connection.getInputStream());
        return geocoder.decode(content);
}
}
