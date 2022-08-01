//85
public class func{
	public void testFailNoFromClauseSelect(){
         Connection conn = DriverManager.getConnection(getUrl());
             conn.createStatement().executeQuery("SELECT foo, bar");
}
}
