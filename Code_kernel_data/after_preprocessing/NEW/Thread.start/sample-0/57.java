//57
public class func{
public void newMethod(final String s){
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println(s);
            }
        };
        new Thread(runnable).start();
}
}
