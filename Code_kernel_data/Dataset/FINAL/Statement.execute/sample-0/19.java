public class func{
public void testDistinctTwoVaryingRows(){
        Statement s = createStatement();
        s.execute("insert into t values (1, 1, 3, 4, '1992-01-02', '19:01:01', '1992-01-01 19:01:01.000', 'goodbye', 'planet')");
}
}
