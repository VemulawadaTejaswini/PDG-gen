public class func{
public void startResponder(final PollableChannel requestChannel){
    new Thread(new Runnable() {
      @Override
      public void run() {
        Message<?> input = requestChannel.receive();
        GenericMessage<String> reply = new GenericMessage<String>(input.getPayload() + "bar");
        ((MessageChannel) input.getHeaders().getReplyChannel()).send(reply);
      }
    }).start();
}
}
