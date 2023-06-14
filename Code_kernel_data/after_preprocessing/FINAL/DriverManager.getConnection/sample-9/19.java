public class func{
public void test1(){
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/diamond?useUnicode=true&&characterEncoding=UTF-8" +
                        "&connectTimeout=3000&socketTimeout=3000&autoReconnect=true",
                "diamond", "diamond");
        connection.setAutoCommit(false);
        PreparedStatement ps = connection.prepareStatement(
                "insert into miao values(18600110022, 1, now())");
        int rows = ps.executeUpdate();
        ps.close();
}
}
