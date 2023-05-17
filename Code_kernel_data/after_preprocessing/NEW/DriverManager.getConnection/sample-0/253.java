//253
public class func{
public void openConnection(){
        Connection conn = DriverManager.getConnection(url, user, password);
        connections.add(conn);
}
}
