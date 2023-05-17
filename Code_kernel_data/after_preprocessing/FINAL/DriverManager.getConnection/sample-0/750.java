public class func{
public void setup(){
        JdbcDataSource ds = new JdbcDataSource();
    ds.setURL("jdbc:h2:./h2/foo");
        dbProperties.put(TransactionalDriver.XADataSource, ds);
        conn2 = DriverManager.getConnection(url, dbProperties);
}
}
