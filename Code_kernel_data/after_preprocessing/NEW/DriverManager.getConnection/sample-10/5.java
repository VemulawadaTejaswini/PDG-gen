//5
public class func{
public void execute(String url){
            Connection conn = DriverManager.getConnection(url);
            conn.close();
}
}
