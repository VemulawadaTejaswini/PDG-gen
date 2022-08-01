//130
public class func{
	public void testToDate_CustomTimeZoneViaQueryServices(){
        Connection customTimeZoneConn = DriverManager.getConnection(getUrl(), props);
        assertEquals(
                -ONE_HOUR_IN_MILLIS,
                callToDateFunction(customTimeZoneConn, "TO_DATE('1970-01-01 00:00:00.000')").getTime());
}
}
