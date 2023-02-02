//31
public class func{
public void createConnection(){
            if((_uname == null) && (_passwd == null)) {
                return DriverManager.getConnection(_connectUri);
            } else {
                return DriverManager.getConnection(_connectUri,_uname,_passwd);
            }
}
}
