public class func{
public void _getSQLConnection(){
            return DriverManager.getConnection(db + "?autoReconnect=true&user=" + username + "&password=" + password);
}
}
