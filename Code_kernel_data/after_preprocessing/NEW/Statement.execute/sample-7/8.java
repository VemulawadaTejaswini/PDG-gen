//8
public class func{
public void test_10_NextValue(){
        Statement s = createStatement();
        s.executeUpdate("CREATE SEQUENCE mySeq1");
        s.execute("DROP SEQUENCE mySeq1 restrict");
}
}
