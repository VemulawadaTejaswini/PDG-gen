//30
public class func{
	public void createDb(String user,String... dbs){
    for(String db : dbs) {
      assertTrue(db + " is not part of known test dbs which will be cleaned up after the test", allowedDBs.contains(db));
      statement.execute("CREATE DATABASE " + db);
    }
    statement.close();
}
}
