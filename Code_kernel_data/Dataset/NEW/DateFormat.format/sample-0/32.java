//32
public class func{
public void postATestMessage(){
    Date date = new Date();
    String value="[TEST] Hello World! It's "+dateFormat.format(date);
    connector.post(value);
    logger.info("Linkedin POST test:"+  value);
}
}
