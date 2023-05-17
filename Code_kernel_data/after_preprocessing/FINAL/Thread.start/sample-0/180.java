public class func{
public void loadInNewThread(final Context context){
        new Thread(new Runnable() {
            public void run() {
                loadContextMenuIntents(context);
            }
        }).start();
}
}
