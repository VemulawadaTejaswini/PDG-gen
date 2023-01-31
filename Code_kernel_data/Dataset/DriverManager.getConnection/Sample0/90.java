//89
public class func{
	public void setConnection(){
        String host = "jdbc:" + TARDIS.plugin.getConfig().getString("storage.mysql.url") + "?autoReconnect=true";
        String user = TARDIS.plugin.getConfig().getString("storage.mysql.user");
        String pass = TARDIS.plugin.getConfig().getString("storage.mysql.password");
            connection = DriverManager.getConnection(host, user, pass);
            connection.setAutoCommit(true);
}
}
