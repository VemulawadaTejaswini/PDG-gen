public class func{
public void invalidCharacters(){
    Connection conn = DriverManager.getConnection(getUrl());
    conn.createStatement().execute(ddl);
      conn.createStatement().executeQuery("SELECT * FROM test_table WHERE some_column = DECODE('zzxxuuyyzzxxuuyy', 'hex')");
}
}
