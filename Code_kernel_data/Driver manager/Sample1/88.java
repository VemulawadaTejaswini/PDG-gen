//87
public class func{
	public void testSameColumnNameInPKAndNonPK(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(query);
}
}
