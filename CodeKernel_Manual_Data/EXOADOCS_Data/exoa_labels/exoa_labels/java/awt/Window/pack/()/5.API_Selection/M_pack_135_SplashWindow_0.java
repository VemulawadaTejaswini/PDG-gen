public class A{
	public SplashWindow(String imageName){
		super((Frame)null);
		JLabel l = new JLabel(new ImageIcon(this.getClass().getResource(imageName)));
		l.setOpaque(false);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(l, BorderLayout.CENTER);
		pack();
		Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
		Dimension labelSize = l.getPreferredSize();
		setLocation(screenSize.width/2 - (labelSize.width/2),screenSize.height/2 - (labelSize.height/2));
	}
}