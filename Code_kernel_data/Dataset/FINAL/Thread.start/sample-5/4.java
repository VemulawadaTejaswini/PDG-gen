public class func{
public void main(String[] args){
        Thread thread = new ThreadInAnotherAppContext();
        thread.start();
        thread.join();
}
}
