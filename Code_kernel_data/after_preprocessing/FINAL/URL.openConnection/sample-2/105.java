public class func{
public void testNewURLWithoutHandler_open(){
    URL noHandlerUrl = JWBF.newURLWithoutHandler("http://www.google.com");
      noHandlerUrl.openConnection();
}
}
