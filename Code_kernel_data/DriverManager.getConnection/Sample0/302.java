//301
public class func{
	public void connect(String database,String host,int port,String user,String pass){
            return DriverManager.getConnection(
                "jdbc:mysql://"+host+":"+port+"/"+database+"?useUnicode=true&characterEncoding=UTF8", user, pass);
}
}
