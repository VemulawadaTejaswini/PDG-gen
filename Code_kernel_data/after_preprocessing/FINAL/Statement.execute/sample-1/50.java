public class func{
public void setUp(){
        Statement s = createStatement();
        s.execute("delete from t1");
        s.close();
}
}
