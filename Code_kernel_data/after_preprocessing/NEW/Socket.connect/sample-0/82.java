//82
public class func{
public void ignoreIfDatabaseNotAvailable(){
        socket.connect(new InetSocketAddress("localhost", databasePort));
        socket.close();
}
}
