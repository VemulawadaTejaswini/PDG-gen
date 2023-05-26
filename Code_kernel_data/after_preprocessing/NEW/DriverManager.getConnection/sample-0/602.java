//602
public class func{
public void setUp(){
    outConnection = DriverManager.getConnection("jdbc:hsqldb:mem:copiedDb", "SA", "");
    outConnection.createStatement().executeUpdate(CREATE_STATEMENT);
}
}
