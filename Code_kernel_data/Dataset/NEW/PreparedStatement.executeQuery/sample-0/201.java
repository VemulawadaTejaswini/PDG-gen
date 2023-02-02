//201
public class func{
public void runOneRowQueryTest(String oneRowQuery,boolean isIntegerColumn,Integer expectedIntValue,BigDecimal expectedDecimalValue){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL);
            PreparedStatement statement = conn.prepareStatement(oneRowQuery);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
}
}
