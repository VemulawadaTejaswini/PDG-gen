public class func{
public void setUp(){
        Statement s = createStatement();
        s.execute("insert into EXCEPTION_TABLE1 (id, data)" +
                  "values (1, 'data1')");
        s.close();
}
}
