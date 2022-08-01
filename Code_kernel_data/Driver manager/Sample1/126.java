//125
public class func{
	public void testEncryption(){
        String url = getURL(dbName + ";CIPHER=AES", true);
        conn = DriverManager.getConnection(url, user, password);
        stat = conn.createStatement();
        stat.execute("create table test(id int primary key)");
}
}
