//143
public class func{
	public void testLog(double expected,Statement stat){
        assertEquals((int) (Math.log(10) * 100), (int) (rs.getDouble(1) * 100));
        stat.execute("drop table log");
}
}
