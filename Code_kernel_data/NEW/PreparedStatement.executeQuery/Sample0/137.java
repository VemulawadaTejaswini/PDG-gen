//136
public class func{
	public void run(Connection conn,long uid){
        PreparedStatement stmt = this.getPreparedStatement(conn, getReviewUser);
        stmt.setLong(1, uid);
        ResultSet r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
