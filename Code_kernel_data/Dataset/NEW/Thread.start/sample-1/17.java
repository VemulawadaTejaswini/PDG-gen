//17
public class func{
public void evaluate(){
                Thread t = new Thread("JavaFX Init Thread") {
                    public void run() {
                        Application.launch(JavaFXRule.class, new String[0]);
                    }
                };
                t.setDaemon(true);
                t.start();
}
}
