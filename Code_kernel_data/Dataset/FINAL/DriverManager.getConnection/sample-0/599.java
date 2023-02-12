public class func{
public void dropDerbyDB(){
      DriverManager.getConnection("jdbc:derby:memory:coopr;drop=true");
}
}
