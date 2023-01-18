//109
public class func{
	public void destroyIndexTable(){
        ConnectionQueryServices services = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class).getQueryServices();
        HBaseAdmin admin = services.getAdmin();
            admin.disableTable(INDEX_TABLE_FULL_NAME);
            admin.deleteTable(INDEX_TABLE_FULL_NAME);
}
}
