public class func{
public void testShutdown(){
            DriverManager.getConnection(
                    "jdbc:derby:memory:/tmp/myDB;shutdown=true");
}
}
