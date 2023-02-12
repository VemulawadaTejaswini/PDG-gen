public class func{
public void testCreateFromProperty(){
    assertEquals(format.format(date), format.format(importProperty.getLastRemoteModificationTime()));
}
}
