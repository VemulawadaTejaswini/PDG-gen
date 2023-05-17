public class func{
public void getSchemaTransition(String nextSchema){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("VALUES CURRENT SCHEMA");
        rs.next();
        String prevSchema = rs.getString(1);
        rs.close();
}
}
