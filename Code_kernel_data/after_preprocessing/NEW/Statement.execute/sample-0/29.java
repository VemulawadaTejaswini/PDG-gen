//29
public class func{
public void testDERBY_6317_value6(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 6035609);
        confirmIndexScanUsage(stmt, 6035609);
}
}
