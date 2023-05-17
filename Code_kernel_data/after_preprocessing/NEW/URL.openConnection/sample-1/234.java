//234
public class func{
public void sendRequest(){
        URLConnection connection = new URL("http://localhost:8181/cxf/HelloWorld")
                .openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
}
}
