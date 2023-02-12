public class func{
public void getAdditionalActionSettings(Project project,BaseAnalysisActionDialog dialog){
    myAnnotateLocalVariablesCb = new JCheckBox("Annotate local variables", PropertiesComponent.getInstance().getBoolean(ANNOTATE_LOCAL_VARIABLES, false));
    panel.add(myAnnotateLocalVariablesCb);
}
}
