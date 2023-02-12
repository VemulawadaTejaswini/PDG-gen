public class func{
public void testDistinctIdenticalAndDifferingRows(){
        Statement s = createStatement();
        s.execute("insert into t values (2, 1, 4, 3, '1992-01-01', '19:01:01', '1992-01-01 19:01:01.000', 'hello', 'planet')");
}
}
