public class A{
	public ButtonWindow(){
		super( "Controls" ) ;
		bpanel = new ButtonPanel() ;
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		setPreferredSize( new Dimension( 800 , 200 ) ) ;
		add( bpanel ) ;
		pack() ;
		setVisible( true ) ;
	}
}