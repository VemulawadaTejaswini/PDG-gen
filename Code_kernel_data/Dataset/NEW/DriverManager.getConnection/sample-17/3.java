//3
public class func{
public void connectWithVersion1_1(){
        Properties info = new Properties();
        info.setProperty("password", this.password);
        return DriverManager.getConnection(url, info);
}
}
