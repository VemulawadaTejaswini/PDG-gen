public class func{
public void test_OpenCloseJDBC(){
      DriverManager.registerDriver(new Driver());
      Connection c = DriverManager.getConnection("jdbc:mysql:
}
}
