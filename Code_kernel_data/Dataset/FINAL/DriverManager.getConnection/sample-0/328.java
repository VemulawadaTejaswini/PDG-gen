public class func{
public void shutdownDerby(){
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
