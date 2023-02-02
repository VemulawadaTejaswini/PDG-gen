//15
public class func{
public void getConnection(String user,String password,String url){
        if(user != null) {
            cx = DriverManager.getConnection(url, user, password);
        } else {
            cx = DriverManager.getConnection(url);
        }
}
}
