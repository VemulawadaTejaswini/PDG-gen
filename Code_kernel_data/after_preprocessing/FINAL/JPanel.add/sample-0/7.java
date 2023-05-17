public class func{
public void addGui(PreferenceTabbedPane gui){
            panel.add(new JLabel(tr("Firefox executable")), GBC.std().insets(10,5,5,0));
            panel.add(firefox, GBC.eol().insets(0,5,0,0).fill(GBC.HORIZONTAL));
            panel.add(Box.createVerticalGlue(), GBC.eol().fill(GBC.BOTH));
}
}
