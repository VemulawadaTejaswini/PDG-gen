//15
public class func{
public void testCreateNullableInPKMiddle(){
        long ts = nextTimestamp();
        String url = getUrl() + ";" + PhoenixRuntime.CURRENT_SCN_ATTRIB + "=" + (ts + 5); // Run query at timestamp 5
        Connection conn = DriverManager.getConnection(url);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
}
}
