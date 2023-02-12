public class func{
public void close(){
                Statement statement = connection.createStatement();
                statement.execute("SHUTDOWN");
}
}
