//323
public class func{
	public void sendMessage(final ServiceReference ref,final Object content){
        new Thread(new Runnable() {
            public void run() {
                Exchange exchange = ref.createExchange(new MockHandler());
                exchange.send(exchange.createMessage().setContent(content));
            }
        }).start();
}
}
