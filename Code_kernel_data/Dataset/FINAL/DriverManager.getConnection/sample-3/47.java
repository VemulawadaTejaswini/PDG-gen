public class func{
public void testOrderByAggSelectNonAgg(){
            Connection conn = DriverManager.getConnection(getUrl(), props);
                PreparedStatement statement = conn.prepareStatement(query);
                statement.executeQuery();
}
}
