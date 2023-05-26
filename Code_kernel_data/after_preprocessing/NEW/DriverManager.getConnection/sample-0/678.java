//678
public class func{
public void getConnection(){
            return DriverManager.getConnection(Support_SQL.sqlUrl,
                    Support_SQL.sqlLogin, Support_SQL.sqlPassword);
            throw new SQLException("Failed to connect. url=" + Support_SQL.sqlUrl + ", sqlLogin="
                    + Support_SQL.sqlLogin + ", sqlPassword=" + Support_SQL.sqlPassword, e);
}
}
