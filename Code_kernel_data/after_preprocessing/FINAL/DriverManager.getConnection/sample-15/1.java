public class func{
public void openDBCon(){
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection("jdbc:sqlite:" + dbPath.toString());
            }
}
}
