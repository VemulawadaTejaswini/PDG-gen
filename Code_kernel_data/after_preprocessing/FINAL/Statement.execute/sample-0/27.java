public class func{
public void testDERBY_6317_value2(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 6035610);
        confirmIndexScanUsage(stmt, 6035610);
}
}
