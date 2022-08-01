//69
public class func{
	public void fire(Connection conn,ResultSet oldIdent,ResultSet newIdent){
            smt.setString(1, newIdent.getString("host_inode"));
            smt.setString(2, newParentPath);
            smt.setString(3, newIdent.getString("id"));
            ResultSet rs=smt.executeQuery();
            boolean found=rs.next();
            rs.close(); smt.close();
}
}
