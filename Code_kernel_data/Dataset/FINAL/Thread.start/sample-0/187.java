public class func{
public void asyncUpdateDraftSmsMessage(final Conversation conv,final String contents){
        new Thread(new Runnable() {
            public void run() {
                long threadId = conv.ensureThreadId();
                conv.setDraftState(true);
                updateDraftSmsMessage(threadId, contents);
            }
        }).start();
}
}
