public class func{
public void afterPropertiesSet(){
            Thread thread = new Thread(this, "Thread for: " + this);
            thread.start();
}
}
