public class func{
public void testStartKeyStopKey(){
        conn = DriverManager.getConnection(getUrl(), props);
        Statement statement = conn.createStatement();
        statement.execute(query);
        PhoenixStatement pstatement = statement.unwrap(PhoenixStatement.class);
        List<KeyRange>splits = pstatement.getQueryPlan().getSplits();
        assertTrue(splits.size() > 0);
}
}
