public class func{
public void run(Connection conn,long iid,long uid){
        PreparedStatement stmt = this.getPreparedStatement(conn, getReview);
        stmt.setLong(1, iid);
        ResultSet r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
