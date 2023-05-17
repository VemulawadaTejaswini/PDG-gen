public class func{
public void createConnection(){
        if(null == _props) {
            if(_uname == null && _passwd == null) {
                return DriverManager.getConnection(_connectUri);
            }
            return DriverManager.getConnection(_connectUri,_uname,_passwd);
        }
        return DriverManager.getConnection(_connectUri,_props);
}
}
