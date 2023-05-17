public class func{
public void createConnection(){
        return DriverManager.getConnection("jdbc:h2:mem:", "sa", "");
}
}
