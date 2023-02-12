public class func{
public void closeHibernateDerby(){
            DriverManager.getConnection(JDBC_DERBY_URL + ";shutdown=true");
}
}
