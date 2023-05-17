public class func{
public void getConnection(){
        if (jdbcUser == null && jdbcPassword == null ) {
            return DriverManager.getConnection(jdbcUrl);
        } else {
            String password = jdbcPassword;
            if (PropertyValueEncryptionUtils.isEncryptedValue(password)) {
                log("Encryption key is " + encryptionKey);
                password = decryptPassword(
                                "PBEWithMD5AndDES",
                                encryptionKey,
                                password);
            }
            return DriverManager.getConnection(jdbcUrl, jdbcUser, password);
        }
}
}
