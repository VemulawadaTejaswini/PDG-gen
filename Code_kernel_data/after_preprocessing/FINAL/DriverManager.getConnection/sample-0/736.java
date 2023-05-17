public class func{
public void getConnection(){
    return DriverManager.getConnection(
        _tool.getDbServerHost() + "/" + _tool.getTestCatalog(), _tool.getUser(), _tool.getPassword());
}
}
