//307
public class func{
	public void isro(){
        DriverManager.getConnection(
        "jdbc:default:connection").getMetaData().isReadOnly();
}
}
