//152
public class func{
public void getResultSetWithHoldability(int holdability,ResultSet[] rs){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                                        ResultSet.CONCUR_READ_ONLY,
                                        holdability);
        rs[0] = s.executeQuery("values (1), (2), (3)");
}
}
