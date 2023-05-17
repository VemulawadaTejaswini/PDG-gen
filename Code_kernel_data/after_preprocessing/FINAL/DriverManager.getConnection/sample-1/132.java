public class func{
public void createAsSelect(String url,boolean optimize){
        Connection conn = DriverManager.getConnection(url +
                ";OPTIMIZE_INSERT_FROM_SELECT=" + optimize);
        Statement stat = conn.createStatement();
        stat.execute("DROP TABLE IF EXISTS TEST2");
}
}
