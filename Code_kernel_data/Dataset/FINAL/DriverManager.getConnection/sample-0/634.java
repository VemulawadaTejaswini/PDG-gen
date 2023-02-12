public class func{
public void open(){
            return DriverManager.getConnection("jdbc:h2:mem:" + name);
}
}
