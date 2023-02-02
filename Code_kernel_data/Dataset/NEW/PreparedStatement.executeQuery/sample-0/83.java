//83
public class func{
public void run(Connection conn,int keyname,Map<Integer,String> results){
        PreparedStatement stmt = this.getPreparedStatement(conn, readStmt);
        stmt.setInt(1, keyname);          
        ResultSet r=stmt.executeQuery();
        while(r.next())
        {
          for(int i=1;i<11;i++)
            results.put(i, r.getString(i));
        }
        r.close();
}
}
