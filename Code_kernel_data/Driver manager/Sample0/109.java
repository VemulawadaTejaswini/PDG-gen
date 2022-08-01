//108
public class func{
	public void destroyTable(){
        ConnectionQueryServices services = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class).getQueryServices();
        HBaseAdmin admin = services.getAdmin();
                admin.disableTable(PRODUCT_METRICS_NAME);
                admin.deleteTable(PRODUCT_METRICS_NAME);
}
}
