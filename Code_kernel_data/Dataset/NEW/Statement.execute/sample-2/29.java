//29
public class func{
public void testConstraintAlterTable(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("alter table parent add column p2 varchar");
}
}
