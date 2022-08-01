//165
public class func{
	public void fire(Connection conn,ResultSet oldSt,ResultSet newSt){
            smt.setString(1, newSt.getString("folder"));
            ResultSet rs=smt.executeQuery();
            boolean found=rs.next();
}
}
