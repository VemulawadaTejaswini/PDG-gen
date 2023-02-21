public class A{
	private void makeApplet(STDInputHandler tHandler,Applet tApplet,int tID, String[] tArgs,int tWidth, int tHeight ){
		Dimension tDimension;
		
		int wDiff;
		int hDiff;
		++instances;
		applet = tApplet;
		args   = tArgs;
		tApplet.setStub( this );
		name = applet.getClass().getName();
		Properties properties = System.getProperties();
		properties.put( "browser","HyperFrame("+HyperConstants.HYPERVIEWVERSION+")");
		properties.put( "browser.version", "May 19 2007" );
		properties.put( "browser.vendor", "Tony Swain" );
		if ( args != null )parseArgs( args, properties );
		String widthStr = getParameter( "width" );
		if( widthStr != null ){
			width = Integer.parseInt( widthStr );
		}
		else{
			width = tWidth;
		}
		String heightStr = getParameter( "height" );
		if ( heightStr != null ){
			height = Integer.parseInt( heightStr );
		}
		else{
			height = tHeight;
		}
		if ( width == -1 || height == -1 ){
			System.err.println( "HyperFrame Width and height must be specified." );
			System.exit(1);
		}
		String menuEnaStr = getParameter( "peerMenuEna" );
		if ( menuEnaStr != null && menuEnaStr.equals( "true" ) )peerMenuEna = true;
		if ( ! peerMenuEna ){
			MenuBar menuBar = new MenuBar();
			menu = new Menu( "HyperFrame()" );
			menu.add( new MenuItem( "Restart (Reentrant crash bug!)" ) );
			menu.add( new MenuItem( "New View   (These Should work)") );
			menu.add( new MenuItem( "Close" ) );
			menu.add( new MenuItem( "Quit" ) );
			menuBar.add( menu );
			setMenuBar( menuBar );
		}
		setLayout( new BorderLayout() );
		add( "Center", tApplet );
		
		
		
		setSize(tWidth,tHeight);
		pack();
		setVisible(true);
		Insets insets = getInsets();
		int h = insets.top+insets.bottom;
		tHeight+=h;
		tWidth += (insets.left<<1);
		tDimension = new Dimension(tWidth, tHeight);
		width = tWidth;
		height = tHeight;
		setPreferredSize(tDimension);
		setBounds(0,0,tWidth,tHeight);
		setSize(tWidth,tHeight);
		pack();
		GraphicsConfiguration gc = getGraphicsConfiguration();
		Rectangle gcBounds = gc.getBounds();
		wDiff   = gcBounds.width  - tWidth;
		hDiff   = gcBounds.height - tHeight;
		setLocation(((wDiff)>>1),((hDiff)>>1));
		if(wDiff < 0){
			((HyperView)tApplet).horizontalScrollEnable=true;
			wDiff = 0;
		}
		if(hDiff < 0){
			((HyperView)tApplet).verticalScrollEnable=true;
			hDiff = 0;
		}
		
		tApplet.start();
		toFront();
		
		
		Toolkit.getDefaultToolkit().addAWTEventListener((AWTEventListener)this,AWTEvent.ACTION_EVENT_MASK|AWTEvent.MOUSE_EVENT_MASK|AWTEvent.MOUSE_MOTION_EVENT_MASK|AWTEvent.WINDOW_EVENT_MASK|AWTEvent.KEY_EVENT_MASK| MouseEvent.MOUSE_WHEEL_EVENT_MASK);
	}
}