public class func{
public void getAdditionalActionSettings(Project project,BaseAnalysisActionDialog dialog){
    myUpdateExistingCopyrightsCb = new JCheckBox("Update existing copyrights", 
                                                 PropertiesComponent.getInstance().getBoolean(UPDATE_EXISTING_COPYRIGHTS, true));
    panel.add(myUpdateExistingCopyrightsCb);
}
}
