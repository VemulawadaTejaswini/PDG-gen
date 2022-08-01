//143
public class func{
	public void run(Connection conn,int start,int count,List<Map<Integer,String>> results){
        PreparedStatement stmt = this.getPreparedStatement(conn, scanStmt);
        stmt.setInt(2, start+count); 
        ResultSet r=stmt.executeQuery();
        while(r.next())
        {
          HashMap<Integer,String> m=new HashMap<Integer,String>();
          for(int i=1;i<11;i++)
            m.put(i, r.getString(i));
          results.add(m);
        }
        r.close();
}
}
