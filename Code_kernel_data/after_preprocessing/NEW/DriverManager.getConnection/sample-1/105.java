//105
public class func{
public void testEncryption(){
        conn.close();
        conn = DriverManager.getConnection(url, user, password);
        stat = conn.createStatement();
        stat.execute("drop table test");
}
}
