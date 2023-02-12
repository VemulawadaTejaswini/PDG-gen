public class func{
public void mystartJBMS(){
        conn = DriverManager.getConnection(dbURL + ";create=false");
        conn.setAutoCommit(false);
}
}
