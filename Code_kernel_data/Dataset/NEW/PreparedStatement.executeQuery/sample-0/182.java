//182
public class func{
public void readMinusCounter(Connection conn){
        PreparedStatement   ps = chattyPrepare( conn, "values ( f_readMinusCounter() )" );
        ResultSet                   rs = ps.executeQuery();
        rs.next();
        int     result = rs.getInt( 1 );
        rs.close();
}
}
