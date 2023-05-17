public class func{
public void setupTable(String tableName){
    statement.execute("LOAD DATA LOCAL INPATH '"
      + dataFilePath.toString() + "' INTO TABLE " + tableName);
}
}
