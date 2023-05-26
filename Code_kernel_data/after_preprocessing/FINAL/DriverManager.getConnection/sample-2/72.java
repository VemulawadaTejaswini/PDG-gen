public class func{
public void getVarcharFromDb(int id){
        Connection con = DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT CHARDATA FROM CSDATA " +
                "WHERE ID = " + id);
        rs.next();
        String chardata = rs.getString(1);
        rs.close();
}
}
