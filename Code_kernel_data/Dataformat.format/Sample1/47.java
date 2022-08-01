//46
public class func{
	public void testLastUpdated(){
    Date date = Clock.currentDate();
    property.setLastRemoteModificationTime(date);
    assertEquals(format.format(date), format.format(property.getLastRemoteModificationTime()));
    assertEquals(format.format(date), property.get("LastRemoteModification"));
}
}
