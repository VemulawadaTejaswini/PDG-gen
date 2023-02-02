//307
public class func{
public void execute(final Command<T> command){
        new Thread(new Runnable() {
            public void run() {
                executeNext(command);
            }
        }).start();
}
}
