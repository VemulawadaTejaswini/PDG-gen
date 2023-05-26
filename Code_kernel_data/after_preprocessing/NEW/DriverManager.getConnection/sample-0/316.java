//316
public class func{
public void connect(){
        return DriverManager.getConnection(getJdbcUrl(), getJdbcUsername(), getJdbcPassword());
}
}
