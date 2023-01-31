//235
public class func{
	public void nextConnection(){
            this.conn =  DriverManager.getConnection(getUrl() + ';' + TENANT_ID_ATTRIB + '=' + "tenant1", props);
}
}
