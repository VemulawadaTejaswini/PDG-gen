//79
public class func{
	public void run(){
                    Connection conn = DriverManager.getConnection(getUrl());
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from test where name = 'name2'");
                    while (rs.next()) {
                        // Just make sure we run over all records
                    }
                    rs.close();
}
}
