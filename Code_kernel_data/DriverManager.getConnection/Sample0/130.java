//129
public class func{
	public void testToDate_CustomTimeZoneViaQueryServicesAndCustomFormat(){
        Connection customTimeZoneConn = DriverManager.getConnection(getUrl(), props);
        assertEquals(
                -ONE_HOUR_IN_MILLIS,
                callToDateFunction(
                        customTimeZoneConn, "TO_DATE('1970-01-01', 'yyyy-MM-dd')").getTime());
}
}
