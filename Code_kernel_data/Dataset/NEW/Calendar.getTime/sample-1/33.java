//33
public class func{
public void testDateHeaderConversion(){
        Calendar cal = org.jaudiotagger.audio.asf.util.Utils.getDateOf(BigInteger.valueOf(1964448000));
        System.out.println(cal.getTime());
        assertEquals(-11644273555200l,cal.getTimeInMillis());
}
}
