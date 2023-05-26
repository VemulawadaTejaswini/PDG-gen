//19
public class func{
public void main(String[] args){
        Thread thread = new Thread(group, new TestGuiAvailable());
        thread.start();
        thread.join();
}
}
