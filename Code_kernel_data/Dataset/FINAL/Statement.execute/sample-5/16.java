public class func{
public void testTransactionCycleDisabled(){
    Statement s = conn.createStatement();
    s.execute("set disableLocalTxn true");
}
}
