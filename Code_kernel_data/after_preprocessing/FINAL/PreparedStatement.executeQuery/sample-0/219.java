public class func{
public void getValue(PreparedStatement ps,double value){
        ps.setDouble(1, value);
        ResultSet rs = ps.executeQuery();
        rs.next();
        double rValue = rs.getDouble(1);
        rs.close();
}
}
