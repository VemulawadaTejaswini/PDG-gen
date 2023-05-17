public class func{
public void proc_test1_DeleteAfterTrigger_update_table(int p1){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement ps = conn.prepareStatement(
            "delete from table1 where id=" + p1);
        ps.executeUpdate();
}
}
