public class func{
public void testLastModificationTime(){
    WikiPageProperties props = new WikiPageProperties();
    assertEquals(format.format(Clock.currentDate()), format.format(props.getLastModificationTime()));
}
}
