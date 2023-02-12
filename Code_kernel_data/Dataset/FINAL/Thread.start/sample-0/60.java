public class func{
public void actionThread(){
        final Thread thread = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    menuAction.run(getText());
                }
            }
        );
        thread.start();
}
}
