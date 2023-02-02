//34
public class func{
public void quit(){
    Thread t = new Thread(new Runnable() {
      public void run() {
        Game.getInstance().quit();
      }
    });
    t.start();
}
}
