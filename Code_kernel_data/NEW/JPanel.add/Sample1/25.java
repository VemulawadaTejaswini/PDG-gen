//24
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.testContainsLabel()#1{
    jPanel.add(new JLabel("Some text"));
    Panel panel = new Panel(jPanel);
    assertTrue(panel.containsLabel("Some text"));
    assertTrue(panel.containsLabel("text"));
    assertFalse(panel.containsLabel("unknown"));
}
}
