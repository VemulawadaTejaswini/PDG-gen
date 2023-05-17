public class func{
public void stop(){
                Statement statement = connection.createStatement();
                statement.execute("SHUTDOWN");
}
}
