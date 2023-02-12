public class func{
public void run(){
                    Connection conn = DriverManager.getConnection(getUrl());
                    ResultSet tablesRs = conn.getMetaData().getTables(null, null, null, null);
                    while (tablesRs.next()) {
                    }
                    tablesRs.close();
}
}
