//158
public class func{
	public void testCanonical(String string1,String string2){
    DateFormat instanceWithArbitraryOrigin = new MissionElapsedTimeFormat(new Date(), FORMAT_STRING);
    assertEquals(string1,
        string2, instanceWithArbitraryOrigin.format(instanceWithArbitraryOrigin.parse(string1)));
}
}
