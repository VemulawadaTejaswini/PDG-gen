public class A{
	private void initialiseDialog(){
		getContentPane().add(form);
		form.addActionListener(this);
		addWindowListener(this);
		pack();
	}
}