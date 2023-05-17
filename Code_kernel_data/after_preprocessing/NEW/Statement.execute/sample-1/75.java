//75
public class func{
public void setupTestTableWithData(String tableName,Path dataFilePath,Connection hs2Conn){
    stmt.execute("load data local inpath '"
        + dataFilePath.toString() + "' into table " + tableName);
    stmt.close();
}
}
