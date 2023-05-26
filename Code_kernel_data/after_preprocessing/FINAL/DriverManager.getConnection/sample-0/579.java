public class func{
public void connection(){
    return DriverManager.getConnection("jdbc:hsqldb:mem:db", "sa", "");
}
}
