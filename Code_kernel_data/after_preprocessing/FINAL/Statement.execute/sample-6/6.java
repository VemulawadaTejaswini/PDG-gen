public class func{
public void dontrun_testDERBY_6317(){
        for (int i = 0; i < SELECT_ROWS_COUNT; i++) { 
            stmt.execute(testSelect+i);
            confirmIndexScanUsage(stmt,i);
        }
}
}
