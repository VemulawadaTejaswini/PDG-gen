public class func{
public void createScript(){
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stat = conn.createStatement();
        stat.execute("SCRIPT TO 'script.sql'");
        stat.close();
}
}
