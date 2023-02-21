public class A{
	public JNews(ImageIcon CoolPicture) {
		super(new Frame());
		
		JPanel PanelForBorder=new JPanel(new BorderLayout());
		PanelForBorder.setLayout(new BorderLayout());
		PanelForBorder.add(new JLabel(CoolPicture), BorderLayout.CENTER);
		PanelForBorder.add(StatusBar=new JLabel(DefaultStatus, SwingConstants.CENTER), BorderLayout.SOUTH);
		PanelForBorder.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		add(PanelForBorder);
		pack();
		
		Dimension WindowSize=getSize(),ScreenSize=Toolkit.getDefaultToolkit().getScreenSize();

		setBounds((ScreenSize.width-WindowSize.width)/2,(ScreenSize.height-WindowSize.height)/2, WindowSize.width,WindowSize.height);
		setVisible(true);
	}
}