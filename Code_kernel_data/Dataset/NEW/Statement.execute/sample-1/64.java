//64
public class func{
public void configureConnection(){
    Statement stmt = createStatement();
    stmt.execute(
        "set hive.fetch.output.serde = org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe");
    stmt.close();
}
}
