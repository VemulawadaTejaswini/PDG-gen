public class func{
public void createCombo(JPanel panel,Enum e){
            cmb.setModel(new EnumComboBoxModel(e.getClass()));
            cmb.addActionListener(this);
            panel.add(cmb);
}
}
