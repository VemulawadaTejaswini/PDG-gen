//260
public class func{
public void addCheckboxToPanel(String name,boolean toSelect,JPanel panel,boolean toUpdate){
    StateRestoringCheckBox cb = new StateRestoringCheckBox(name);
    cb.setSelected(toSelect);
    panel.add(cb);
}
}
