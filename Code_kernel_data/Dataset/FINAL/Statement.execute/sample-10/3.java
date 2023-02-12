public class func{
public void testLog(double expected,Statement stat){
        stat.execute("insert into log values(1)");
        ResultSet rs = stat.executeQuery("select log(10) from log");
        rs.next();
        assertEquals((int) (expected * 100), (int) (rs.getDouble(1) * 100));
}
}
