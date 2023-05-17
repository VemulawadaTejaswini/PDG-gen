public class func{
public void connect(){
    this.connection = DriverManager.getConnection(info.url, info.username,
        info.password);
}
}
