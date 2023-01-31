//450
public class func{
	public void setUpH2Conn(){
        h2Connection = DriverManager.getConnection("jdbc:h2:mem:db" + (h2InstanceCount++), "sa", "");
        H2Database h2DB = new H2Database(h2Connection, config);
        h2DB.loadAllTables(joinType);
}
}
