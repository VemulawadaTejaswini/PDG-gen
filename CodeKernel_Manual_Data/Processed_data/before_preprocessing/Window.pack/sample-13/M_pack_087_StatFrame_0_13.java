public class A{
	public void createAndShowGUI() {
		setTitle("Statistics of Actor(s)");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		getContentPane().add(ui());
		addWindowListener(this);
		
		pack();
		setVisible(true);
		
	}
}