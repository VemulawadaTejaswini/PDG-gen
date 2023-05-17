//560
public class func{
public void shutdown(){
        DriverManager.getConnection("jdbc:derby:tasks;shutdown=true");
}
}
