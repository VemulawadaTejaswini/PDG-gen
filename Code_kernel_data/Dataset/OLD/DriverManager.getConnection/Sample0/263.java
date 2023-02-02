//262
public class func{
	public void connectMysql(){
        String password = props.getProperty(PWD); //"";
        connection = DriverManager.getConnection(url+dbName,userName,password);
}
}
