public class func{
public void createConnection(){
      for (Map.Entry<String, String> entry : map.entrySet()) {
        info.setProperty(entry.getKey(), entry.getValue());
      }
          DriverManager.getConnection("jdbc:calcite:", info);
}
}
