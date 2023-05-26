//14
public class func{
public void test_0(){
        Connection conn = DriverManager.getConnection(url, "beidou", "mzbSXikh48dTrVX8kuLYtuok1");
        PreparedStatement stmt = conn.prepareStatement("select sysdate");
        stmt.executeBatch();
}
}
