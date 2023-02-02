//556
public class func{
public void connect(String path_to_dbfile){
        String db_url = "jdbc:hsqldb:file:" + path_to_dbfile + ";crypt_key=" + getCryptKey() + ";crypt_type=blowfish";
        this.aConnection = DriverManager.getConnection(db_url, db_user, db_password);
}
}
