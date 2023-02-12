public class func{
public void shouldCovertToIsoString(){
        cal.set(1912, 5, 23, 2, 15, 47);
        the(Convert.toIsoString(cal.getTime())).shouldBeEqual("1912-06-23T02:15:47Z");
}
}
