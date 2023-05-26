//0
public class func{
public void testVanityDriverArgsInUrl(){
        DriverManager.getConnection(
            "jdbc:splunk:"
            + "url='" + SPLUNK_URL + "'"
            + ";user='" + SPLUNK_USER + "'"
            + ";password='" + SPLUNK_PASSWORD + "'");
    connection.close();
}
}
