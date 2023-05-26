public class func{
public void itemStateChanged(final ItemEvent e){
                        final Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                updateConfigPanelEditable(true);
                            }
                        });
                        thread.start();
}
}
