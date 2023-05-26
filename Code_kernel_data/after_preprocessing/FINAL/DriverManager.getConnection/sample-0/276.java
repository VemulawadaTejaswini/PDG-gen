public class func{
public void connect(){
        String dbPath = "jdbc:sqlite:" + dbFile.getAbsolutePath();
        return DriverManager.getConnection(dbPath);
}
}
