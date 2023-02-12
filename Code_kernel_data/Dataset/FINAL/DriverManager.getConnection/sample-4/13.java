public class func{
public void init(){
        if(dbFile.exists()) {
            dbFile.delete();
        }
        connection = DriverManager.getConnection(databasePath,
                "sa", "");
}
}
