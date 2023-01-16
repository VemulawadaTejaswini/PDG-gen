//37
public class func{
	public void actionPerformed(final ActionEvent e){
                        final Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                addInterface(type);
                            }
                        });
                        thread.start();
}
}
