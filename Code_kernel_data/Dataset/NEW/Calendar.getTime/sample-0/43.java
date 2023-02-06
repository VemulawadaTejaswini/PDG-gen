//43
public class func{
public void testProducerWithDateHeader(){
        Calendar cal = Calendar.getInstance();
        cal.set(1974, Calendar.APRIL, 20);
        Date date = cal.getTime();
        template.sendBodyAndHeader("file://target/filelanguage?fileName=mybirthday-${date:in.header.birthday:yyyyMMdd}.txt",
            "Hello World", "birthday", date);
}
}
