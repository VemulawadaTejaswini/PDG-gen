public class A{
	public MissionDialog(Frame parent, boolean modal, Risk r) {
		
		super(parent, modal);
		
		text=r.getCurrentMission();
		
		try {
			mission = ImageIO.read( this.getClass().getResource("mission.jpg") );
		}
		catch (Exception e) { }
		
		initGUI();
		
		setResizable(false);
		
		pack();
		
	}
}