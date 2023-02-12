public class func{
public void testDERBY_6317_value4(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 5189285);
        confirmIndexScanUsage(stmt, 5189285);
}
}
