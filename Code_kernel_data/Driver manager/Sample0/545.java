//544
public class func{
	public void createConnection(String dataDir){
        File dataBase = new File(dataDir, "InvoiceDB.mdb");
        mConnection = DriverManager.getConnection(connectionString);
}
}
