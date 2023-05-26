public class func{
public void sendRequest(){
        URLConnection connection = new URL("http:
                .openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
}
}
