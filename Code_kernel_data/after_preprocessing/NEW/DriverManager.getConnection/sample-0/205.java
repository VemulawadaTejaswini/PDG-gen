//205
public class func{
public void getDiskDatabase(String path){
      return DriverManager.getConnection("jdbc:h2:" + path);
      throw new RuntimeException(
          "Could not connect to database: " + path, e);
}
}
