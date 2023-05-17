public class func{
public void createConnection(){
              final Properties info = new Properties();
              info.setProperty("model", "inline:" + model);
              return (OptiqConnection) DriverManager.getConnection(
                  "jdbc:optiq:", info);
}
}
