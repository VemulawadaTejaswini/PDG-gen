//219
public class func{
	public void getValue(PreparedStatement ps,double value){
        ps.setDouble(1, value);
        ResultSet rs = ps.executeQuery();
        rs.next(); // we know a single value will be returned.
        double rValue = rs.getDouble(1);
        rs.close();
}
}
