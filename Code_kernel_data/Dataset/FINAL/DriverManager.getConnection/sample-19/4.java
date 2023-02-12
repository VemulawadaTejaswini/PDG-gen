public class func{
public void db(File dbFile,String tableName,Iterator<SamRecordDiscrepancy> it){
    Connection connection = DriverManager.getConnection("jdbc:h2:"
        + dbFile.getAbsolutePath());
    createDiscrepancyTable(tableName, connection);
    dbLog(tableName, it, connection);
    connection.commit();
    connection.close();
}
}
