//29
public class func{
public void dropDb(String user,String... dbs){
    for(String db : dbs) {
      statement.execute("DROP DATABASE IF EXISTS " + db + " CASCADE");
    }
    statement.close();
}
}
