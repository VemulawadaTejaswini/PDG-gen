//14
public class func{
public void proc_test3_UpdateAfterTrigger_update_table(int p1,int p2){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement ps = conn.prepareStatement("update table2 "+
            "set updates = " + p1 + " where table2.id = " + p2);
        ps.executeUpdate();
}
}
