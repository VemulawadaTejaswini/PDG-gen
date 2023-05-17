public class func{
public void testDERBY_6317_value5(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 1);
        confirmIndexScanUsage(stmt, 1);
}
}
