public class func{
public void run(){
                    Connection conn = DriverManager.getConnection(getUrl());
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from test where name = 'name2'");
                    while (rs.next()) {
                    }
                    rs.close();
}
}
