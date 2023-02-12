public class func{
public void createOptionsPanel(){
    panel.add(new SingleCheckboxOptionsPanel("Ignore fields used in multiple methods", this, "IGNORE_FIELDS_USED_IN_MULTIPLE_METHODS"), BorderLayout.NORTH);
    panel.add(listPanel, BorderLayout.CENTER);
}
}
