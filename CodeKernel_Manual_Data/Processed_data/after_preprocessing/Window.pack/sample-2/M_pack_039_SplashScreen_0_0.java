public class A{
	public void show (String splashIcon,String splashTitle,String splashMessage) {
		String pre="<html><font size=4 face=\"sans-serif\" color=\"blue\">";
		String post="</font></html>";
		if (splashTitle==null) splashTitle="";
		if (splashMessage==null) splashMessage="";
		int pw=getPreferredWidth(splashTitle,splashMessage);
		splashTitle=pre+splashTitle+post;
		pre="<html><font size=4 face=\"sans-serif\" color=\"red\">";
		splashMessage=pre+splashMessage+post;
		try {
			splashI.setIcon(new ImageIcon(ResourceManager.getResource(splashIcon)));
		} catch (Exception ex) {}
		splashT.setText(splashTitle);
		splashT.setHorizontalAlignment(JLabel.CENTER);
		splashM.setText(splashMessage);
		splashM.setHorizontalAlignment(JLabel.CENTER);
		try {
			if (pw>600) pw=600;
			splashI.setPreferredSize(new Dimension(pw,(int)((3+pw/600)*getFontMetrics(getFont()).getHeight()*1.5)));
			pack();
			Utils.center(this);
			setVisible(true);
			p.paintImmediately(p.getBounds());
		} catch (Exception ex) {
			setVisible(false);
		}
	}
}