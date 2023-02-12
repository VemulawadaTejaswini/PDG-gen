public class func{
public void BooleanArgRep(Connector.BooleanArgument barg,JPanel comp){
            check = new JCheckBox(barg.label());
            check.setSelected(barg.booleanValue());
            panel.add(check);
            comp.add(panel);
}
}
