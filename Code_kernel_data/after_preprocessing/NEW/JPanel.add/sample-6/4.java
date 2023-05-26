//4
public class func{
public void createCenterAlignmentInCell(JComponent comp){
    GridBagConstraints constraints = new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
    compPanel.add(comp, constraints);
    compPanel.setBackground(comp.getBackground());
}
}
