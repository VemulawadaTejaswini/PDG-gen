//163
public class func{
public void changed(ObservableValue<? extends State> observableValue,State oldState,State newState){
                            new Thread(new Runnable() {
                                public void run() {
                                    tryToInitialize(startCount++, currentTimeMillis());
                                }
                            }, "MapViewInitializer").start();
}
}
