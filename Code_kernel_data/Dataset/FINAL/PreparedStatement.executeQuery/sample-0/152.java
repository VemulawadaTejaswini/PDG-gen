public class func{
public void run(Connection conn,long iid,long uid){
        PreparedStatement stmt = this.getPreparedStatement(conn, getAverageRating);
        stmt.setLong(2, uid);
        ResultSet r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
