//11
public class func{
public void createConnection(boolean firstConnection){
            Connection conn = DriverManager.getConnection("jdbc:jdc:jdcpool");
            conn.setAutoCommit(false);
}
}
