public class func{
public void observeInBackground(final double secs){
      Thread th = new Thread(){
         public void run(){
            observe(secs);
         }
      };
      th.start();
}
}
