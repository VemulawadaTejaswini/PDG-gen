//128
public class func{
public void doConnStmtNoRS(String text){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement stmt = conn.createStatement();
    stmt.execute(text);
}
}
