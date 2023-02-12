public class func{
public void shutdown(String catalog){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
