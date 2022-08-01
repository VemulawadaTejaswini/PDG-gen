//3
public class func{
	public void addAllocatedVMs(AsyncRequest asyncRequest,Connection c){
        pstmt.setString(1, asyncRequest.getId());
        ResultSet rs = pstmt.executeQuery();
        if (rs == null || !rs.next()) {
            return;
        }
        do {
            asyncRequest.addAllocatedVM(rs.getInt(1));
        } while (rs.next());
        pstmt.close();
}
}
