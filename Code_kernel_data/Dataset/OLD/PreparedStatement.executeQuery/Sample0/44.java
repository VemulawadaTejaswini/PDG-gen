//43
public class func{
	public void fire(Connection conn,ResultSet oldCont,ResultSet newCont){
        smt.setString(1, oldCont.getString("identifier"));
        ResultSet rs=smt.executeQuery();
        rs.next();
        int versions=rs.getInt(1);
        rs.close(); smt.close();
}
}
