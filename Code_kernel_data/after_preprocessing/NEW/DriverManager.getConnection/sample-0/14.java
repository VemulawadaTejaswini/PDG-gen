//14
public class func{
public void getConnection(){
        if (url.startsWith("jdbc:hsqldb:")) {
            // Hsqldb requires a username, but doesn't support username as part
            // of the URL, durn it. Assume that the username is "sa".
            return DriverManager.getConnection(url, "sa", "");
        } else {
            return DriverManager.getConnection(url);
        }
}
}
