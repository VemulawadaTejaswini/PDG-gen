public class func{
public void run(Connection conn,int location,String sub_nbr){
      PreparedStatement stmt = this.getPreparedStatement(conn, getSubscriber);
      stmt.setString(1, sub_nbr);
      ResultSet results = stmt.executeQuery();
      if (results.next()) {
        long s_id = results.getLong(1);
        results.close();
        stmt = this.getPreparedStatement(conn, updateSubscriber);
        stmt.setInt(1, location);
        stmt.setLong(2, s_id);
        return stmt.executeUpdate();
        }
      results.close();
}
}
