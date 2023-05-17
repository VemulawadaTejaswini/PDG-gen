//18
public class func{
public void proc_test1_InsertAfterTrigger_update_table(int p1){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement ps = conn.prepareStatement(
            "insert into table2(id, updates) values (" + p1 + ",-1)");
        ps.executeUpdate();
}
}
