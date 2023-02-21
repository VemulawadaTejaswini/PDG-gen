public class A{
	public PathEditFrame_AboutBox(Frame parent) {
		super(parent);
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		pack();
	}
}