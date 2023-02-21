public class A{
	protected void attach(Component testSubject){
		window = (Window) testSubject;
		
		super.attach(window);
		
		getFrame().pack();
	}
}