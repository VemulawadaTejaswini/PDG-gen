//157
public class func{
	public void run(Connection conn,long iid,long uid){
        stmt = this.getPreparedStatement(conn, getTrust);
        stmt.setLong(1, uid);
        r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
