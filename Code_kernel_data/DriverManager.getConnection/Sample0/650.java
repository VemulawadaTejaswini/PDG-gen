//649
public class func{
	public void getResultSetMetaData(String query){
        return new RSMDWrapper( DriverManager.getConnection( "jdbc:default:connection" ), query );
}
}
