public class func{
public void main(String[] args){
        ThreadGroup group = new ThreadGroup("$$$");
        Thread thread = new Thread(group, test);
        thread.start();
        thread.join();
}
}
