public class func{
public void flushRowCount(Statement stmt){
        stmt.execute("CALL SYSCS_UTIL.SYSCS_CHECKPOINT_DATABASE()");
}
}
