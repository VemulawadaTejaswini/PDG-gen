//21
public class func{
public void addField(String label,JComponent field,JPanel panel){
    panel.add(jLabel, new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.WEST,
                                                 GridBagConstraints.NONE, new Insets(0, 0, 5, 0), 4, 0));
    panel.add(field, new GridBagConstraints(1, GridBagConstraints.RELATIVE, 1, 1, 1.0, 0, GridBagConstraints.NORTHWEST,
                                                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 5, 0), 0, 0));
}
}
