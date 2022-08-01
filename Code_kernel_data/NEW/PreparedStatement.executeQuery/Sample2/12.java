//11
public class func{
	public void proc_test1_DeleteBeforeTrigger_select_table(int p1){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement ps = conn.prepareStatement("select updates from " +
            "table2 where table2.id = " + p1);
        ps.executeQuery();
}
}
