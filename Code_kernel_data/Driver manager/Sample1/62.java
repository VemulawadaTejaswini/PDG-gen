//61
public class func{
	public void initTable(){
            conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
