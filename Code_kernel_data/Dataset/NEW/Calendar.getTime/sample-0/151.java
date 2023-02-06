//151
public class func{
public void shouldCovertToIsoString(){
        cal.set(2014, 11, 31, 23, 59, 59);
        the(Convert.toIsoString(cal.getTime())).shouldBeEqual("2014-12-31T23:59:59Z");
}
}
