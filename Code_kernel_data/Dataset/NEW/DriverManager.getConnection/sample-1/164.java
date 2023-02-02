//164
public class func{
public void sqlControl2(String[] e1,String[] e2,String[] e3,String[] e4,String[] e5,String[] e6,String[] e7){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement s = conn.createStatement();
    executeStatement(s, "DROP SCHEMA SQLC_M RESTRICT", e7);
    conn.close();
}
}
