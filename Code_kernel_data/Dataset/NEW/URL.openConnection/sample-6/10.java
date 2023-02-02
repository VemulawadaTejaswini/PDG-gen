//10
public class func{
public void submitRequestTo(URL url){
        URLConnection connection = url.openConnection();
        return StreamUtility.readAllFromStream(connection.getInputStream());
}
}
