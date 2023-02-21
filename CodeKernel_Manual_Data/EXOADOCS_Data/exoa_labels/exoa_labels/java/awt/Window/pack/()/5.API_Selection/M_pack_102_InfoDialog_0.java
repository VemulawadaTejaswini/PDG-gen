public class A{
	public InfoDialog(){
		super("Project Info");
		addWindowListener(new CloseHandler(this));
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		add(new BitmapComponent(FilePath));
		pack();
		setSize(WIDTH, HEIGHT);
		setResizable(false);
	}
}