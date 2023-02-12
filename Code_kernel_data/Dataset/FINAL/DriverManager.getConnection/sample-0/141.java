public class func{
public void setUp(){
        _connection = DriverManager.getConnection("jdbc:derby:jar:(" + dbFile.getAbsolutePath()
                + ")derby_testdb;territory=en");
}
}
