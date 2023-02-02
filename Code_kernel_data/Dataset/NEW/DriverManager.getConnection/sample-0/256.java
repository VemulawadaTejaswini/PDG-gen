//256
public class func{
public void openConnection(){
        Connection conn = DriverManager.getConnection(url, USER, PASSWORD);
        connections.add(conn);
}
}
