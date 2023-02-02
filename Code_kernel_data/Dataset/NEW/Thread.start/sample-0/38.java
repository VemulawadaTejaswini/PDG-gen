//38
public class func{
public void run(){
                        final Thread t = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                addDomainPanel();
                            }
                        });
                        t.start();
}
}
