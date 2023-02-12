public class func{
public void hiveInitializeDatabase(HiveStore hiveStore,String tablename){
    hiveStore.connect();
    Statement stmt = hiveStore.getConnection().createStatement();
    stmt.execute("CREATE TABLE IF NOT EXISTS " + tablename + " (col1 string) PARTITIONED BY(dt STRING) ROW FORMAT DELIMITED FIELDS TERMINATED BY '\n'  \n"
            + "STORED AS TEXTFILE ");
}
}
