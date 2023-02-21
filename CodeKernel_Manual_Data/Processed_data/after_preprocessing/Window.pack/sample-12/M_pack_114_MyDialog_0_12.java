public class A{
	public MyDialog(Frame owner, String message, String title) {
		Label label = new Label(message);
		add(label);
		addWindowListener(this);
		pack();
		show();
	}
}