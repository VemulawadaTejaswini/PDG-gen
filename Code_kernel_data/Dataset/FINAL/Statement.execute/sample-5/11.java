public class func{
public void test_pg_client_encoding1(){
    Statement s = conn.createStatement();
    s.execute("set client_encoding LATIN1");
}
}
