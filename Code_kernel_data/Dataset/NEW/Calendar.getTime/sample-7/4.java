//4
public class func{
public void testInterlining(){
        calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        long time = calendar.getTime().getTime() / 1000;
        Leg[] legs = plan(time, "stop0", "stop3", null, false, false, null, null, null, 2);
        assertEquals(legs[1].routeId, "route1");
        assertTrue(itinerary.transfers == 0);
}
}
