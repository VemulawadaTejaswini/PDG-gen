public class func{
public void testDefaultMinMax(){
        deleteDb("sequence");
        Connection conn = getConnection("sequence");
        Statement stat = conn.createStatement();
        stat.execute("create sequence b START WITH 7320917853639540658 INCREMENT -1");
}
}
