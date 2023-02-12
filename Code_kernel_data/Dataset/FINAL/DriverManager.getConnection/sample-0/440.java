public class func{
public void getTransactionIsolationJDBC(){
        return DriverManager.getConnection("jdbc:default:connection").
                getTransactionIsolation();
}
}
