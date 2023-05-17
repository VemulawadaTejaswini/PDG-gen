//58
public class func{
public void assertDateEquals(Date expected,Date actual){
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    assertEquals(format.format(expected), format.format(actual));
}
}
