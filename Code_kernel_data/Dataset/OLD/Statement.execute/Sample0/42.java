//41
public class func{
	public void dropTables(){
            s.execute("drop table " + table.get("table_name") + " cascade constraints");
            System.out.println("Dropping table: " + table.get("table_name"));
}
}
