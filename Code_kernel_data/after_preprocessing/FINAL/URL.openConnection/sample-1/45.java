public class func{
public void invokeServerAction(String action){
        URL url = new URL("http://" + TestData.SERVER_ADDRESS + "/home/" + action);
        URLConnection connection = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
}
}
