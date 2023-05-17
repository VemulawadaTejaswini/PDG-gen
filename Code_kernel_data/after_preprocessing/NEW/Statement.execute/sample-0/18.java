//18
public class func{
public void testDistinctMixedNullRows(){
        Statement s = createStatement();
        s.execute("insert into t values (1, null, 3, null, '1992-01-02', null, '1992-01-01 19:01:01.000', null, 'planet')");
}
}
