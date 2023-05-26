public class func{
public void getConnection(){
        if ( _jdbcUser == null && _jdbcPassword == null ) {
            return DriverManager.getConnection(_jdbcUrl);
        } else {
            String password = _jdbcPassword;
            if (PropertyValueEncryptionUtils.isEncryptedValue(password)) {
                password = decryptPassword(password);
            }
            return DriverManager.getConnection(_jdbcUrl, _jdbcUser, password);
        }
}
}
