public class func{
public void tearDown(){
        Connection conn = getDataSourceConnection();
        Statement drop = conn.createStatement();
        drop.execute("drop table allmixedup");
        drop.close();
}
}
