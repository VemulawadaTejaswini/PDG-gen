public class func{
public void init(){
                    setConnection(DriverManager.getConnection(getUrl()));
                    createTables();
}
}
