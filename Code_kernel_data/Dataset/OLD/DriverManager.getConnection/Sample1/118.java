//117
public class func{
	public void proc_5280(){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
            s.execute("drop table this_table_does_not_exist");
}
}
