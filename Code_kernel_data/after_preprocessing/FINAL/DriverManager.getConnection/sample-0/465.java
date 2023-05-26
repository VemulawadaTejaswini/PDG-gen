public class func{
public void beforeClass(){
    start = Main.start(new String[]{Factory.class.getName()});
    final int port = start.getPort();
    remoteConnection = DriverManager.getConnection(
        "jdbc:avatica:remote:url=http:
}
}
