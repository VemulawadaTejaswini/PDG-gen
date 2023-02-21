public class A{
	public LoginWindow(Frame frame, String title, boolean modal){
		super(frame, title, modal);
		try{
			jbInit();
			pack();
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}