public class func{
public void connectToDB(String host,int port,String db,String user,String pass){
            conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + db, user, pass);
}
}
