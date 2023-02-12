public class func{
public void initSqlSessionFactory(){
      conn = DriverManager.getConnection("jdbc:hsqldb:mem:heavy_initial_load", "sa", "");
}
}
