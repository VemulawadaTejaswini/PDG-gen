//1
public class func{
public void testGetAge(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        p.setBirthDate(cal.getTime());
        assertEquals(new Integer(16), p.getAge());
}
}
