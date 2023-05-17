//15
public class func{
public void assertDate(String msg,Calendar expectedTime,long actualTime){
        String expected = sdf.format(expectedTime.getTime());
        Assert.assertEquals(msg,expected,actual);
}
}
