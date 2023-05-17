public class func{
public void connect(String catalog){
    Connection conn = DriverManager.getConnection(getCatalogToConnectTo(catalog), _user, _password);
    conn.setAutoCommit(true);
}
}
