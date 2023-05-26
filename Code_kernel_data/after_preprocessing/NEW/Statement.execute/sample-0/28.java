//28
public class func{
public void testDERBY_6317_value1(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 5189284);
        confirmIndexScanUsage(stmt, 5189284);
}
}
