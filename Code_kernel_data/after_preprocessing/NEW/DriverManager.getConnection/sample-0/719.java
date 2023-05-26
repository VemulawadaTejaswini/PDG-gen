//719
public class func{
public void _getConnection(){
    return DriverManager.getConnection(
      "jdbc:hsqldb:file:" + _fileName, "sa", "");
}
}
