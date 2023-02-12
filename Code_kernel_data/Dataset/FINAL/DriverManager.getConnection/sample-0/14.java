public class func{
public void getConnection(){
        if (url.startsWith("jdbc:hsqldb:")) {
            return DriverManager.getConnection(url, "sa", "");
        } else {
            return DriverManager.getConnection(url);
        }
}
}
