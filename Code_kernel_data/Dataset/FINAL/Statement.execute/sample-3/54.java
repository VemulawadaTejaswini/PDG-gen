public class func{
public void doSql(){
        Connection con = h2Datasource.getConnection();
            stmt = con.createStatement();
            stmt.execute("INSERT INTO TEST VALUES ('txt')");
            if (stmt != null) {
                stmt.close();
            }
            con.close();
}
}
