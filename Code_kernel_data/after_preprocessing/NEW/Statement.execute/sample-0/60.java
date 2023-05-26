//60
public class func{
public void setupKv1Tabs(String tableName){
    stmt.execute("load data local inpath '"
        + dataFilePath.toString() + "' into table " + tableName);
}
}
