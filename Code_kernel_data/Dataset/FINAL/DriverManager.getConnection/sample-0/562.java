public class func{
public void MySQLConnection(String hostname,int port,String username,String password){
            this.connection = DriverManager.getConnection("jdbc:mysql://" + hostname + ":" + port,
                    username, password);
}
}
