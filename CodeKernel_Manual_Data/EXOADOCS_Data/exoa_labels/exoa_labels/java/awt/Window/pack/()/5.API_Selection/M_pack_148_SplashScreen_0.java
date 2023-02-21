public class A{
	public SplashScreen(Frame owner) {
		super(owner);
		try {
			setUndecorated(true);
			
			BufferedImage splash = ImageIO.read(this.getClass().getClassLoader().getResource("net/sf/jpluck/res/jpluckx.jpg"));
			BufferedImage canvas = new BufferedImage(400, 206, BufferedImage.TYPE_INT_RGB);
			
			Graphics2D g = canvas.createGraphics();
			g.drawImage(splash, 0, 0, this);
			g.setColor(new Color(255, 255, 255));
			g.setFont(new Font("Dialog", Font.PLAIN, 11));
			g.drawString("Version " + VersionInfo.VERSION + " (" + VersionInfo.RELEASE_DATE + ")", 14, 194);
			g.dispose();
			canvas.flush();
			
			JLabel imageLabel = new JLabel(new ImageIcon(canvas));
			Container c = getContentPane();
			c.add(imageLabel, BorderLayout.CENTER);
			pack();
			WindowUtil.center(this);
			
		} catch (IOException e) {
		}
	}
}