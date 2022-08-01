//53
public class func{
	public void execute(Connection con,String sql){
      stmt = con.createStatement();
      stmt.execute(sql);
      if( stmt != null) try {stmt.close();} catch(Exception e) {}
}
}
