public class func{
public void testDivideByBigDecimalZero(){
        long ts = nextTimestamp();
        String url = getUrl() + ";" + PhoenixRuntime.CURRENT_SCN_ATTRIB + "=" + (ts + 5);
        Connection conn = DriverManager.getConnection(url);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.executeQuery();
}
}
