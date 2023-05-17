//89
public class func{
public void testSqlDate(){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2007, 3, 1, 1, 15);
        Date time = cal.getTime();
        java.sql.Date date = new java.sql.Date(time.getTime());
        String dateTime = DateUtil.serializeSqlDate(date);
        assertEquals("2007-04-01", dateTime);
}
}
