public class func{
public void runOneRowQueryTest(String oneRowQuery,Integer pkValue,String projectedValue){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL);
            PreparedStatement statement = conn.prepareStatement(oneRowQuery);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
}
}
