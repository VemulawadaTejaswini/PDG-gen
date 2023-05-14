public class A{
	private void j3dFlyInit( java.io.File systemPrefsFile,BranchGroup toolBG,SimpleUniverse userUniverse ) {
		new J3dVersionCheck( this );
		java.io.File userPrefsFile;
		String prop = System.getProperty("J3dFly.UserPlugins");
		if (prop==null)userPrefsFile = new java.io.File("userPrefs.xml");
		elseuserPrefsFile = new java.io.File(prop);
		SplashWindow.showMessage("Getting Graphics Configuration");
		if (userUniverse==null) {
			java.net.URL configURL = ConfiguredUniverse.getConfigURL(null);
			if (configURL==null)SplashWindow.showMessage( "Creating Configured Universe ");
			elseSplashWindow.showMessage( "Creating Configured Universe : "+configURL.getFile());
			universe = new ConfiguredUniverse( configURL, new DevelopmentLocaleFactory(), false );
		} elseuniverse = userUniverse;
		((DevelopmentLocale)universe.getLocale()).setHiddenBranchGraph( toolBG );
		universe.getViewer().getView().setBackClipDistance( 100.0 );
		containers = universe.getViewer().getJFrames();
		SplashWindow.showMessage("Creating Controls");
		if (contextClass==null)context = new J3dFlyContext( (DevelopmentLocale)universe.getLocale(), this );
		else {
			try {
				java.lang.reflect.Constructor con = contextClass.getConstructor( new Class[] { DevelopmentLocale.class, J3dFly.class } );
				context = (J3dFlyContext)con.newInstance( new Object[] { (DevelopmentLocale)universe.getLocale(), this } );
			} catch( Exception e ) {
				ErrorManager.getDefault().notify( e, ErrorHandler.ERROR, "Error trying to instantiate context "+contextClass );
				System.exit(1);
			}
		}
		if (userUniverse!=null)context.setUniverse( userUniverse );
		controller = new J3dFlyController( context );
		if (System.getProperty("j3d.configURL")!=null || containers.length>1) {
			KeyControls keyControls = null;
			if (showControls) {
				controlFrame = new ControlFrame( context, controller );
				controlFrame.setJMenuBar( mainMenuBar );
				keyControls = new KeyControls( this, controlFrame );
				toolBarPanel = controlFrame.getToolBarPanel();
			}
			if (containers[0] instanceof JWindow)for(int i=0; i<containers.length; i++) {
				((JWindow)containers[i]).addWindowListener( this );
			}
			else if (containers[0] instanceof JFrame )for(int i=0; i<containers.length; i++) {
				((JFrame)containers[i]).addWindowListener( this );
			}
			Canvas3D[] canvases = universe.getViewer().getCanvas3Ds();
			for(int i=0; i<canvases.length; i++)canvases[i].addKeyListener( keyControls );
		} else {
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			((JFrame)containers[0]).addWindowListener( this );
			((JFrame)containers[0]).setTitle( "Sun Java 3D(tm) Fly Through 2.0beta "+Version.version );
			if (showControls) {
				((JFrame)containers[0]).setJMenuBar( mainMenuBar );
				((JFrame)containers[0]).invalidate();
			}
			((JFrame)containers[0]).pack();
			containers[0].setSize( screenSize.width/2, screenSize.height/2 );
		}
		context.getPluginPreferenceControl().installPlugins( systemPrefsFile,userPrefsFile,context );
	}
}