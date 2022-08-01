//197
public class func{
	public void testInvoke(){
        final NotifyDummyRequestCommand requestCommand = new NotifyDummyRequestCommand("hello");
        final NotifyDummyAckCommand response = new NotifyDummyAckCommand(requestCommand, "hello");
        new Thread(new InnerSetResultRunner(requestCommand, response)).start();
}
}
