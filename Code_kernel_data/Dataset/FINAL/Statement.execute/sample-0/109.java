public class func{
public void testDERBY_6317_value3(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 6031628);
        confirmIndexScanUsage(stmt, 6031628);
}
}
