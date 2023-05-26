//370
public class func{
public void getConnectionHSQLDB(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:Log4j", "sa", "");
}
}
