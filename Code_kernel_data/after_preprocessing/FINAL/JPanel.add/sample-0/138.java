public class func{
public void getHeaderPanel(Project project){
    panel.add(getHeaderPanel(project, GetterTemplatesManager.getInstance(), CodeInsightBundle.message("generate.getter.template")), BorderLayout.NORTH);
    panel.add(getHeaderPanel(project, SetterTemplatesManager.getInstance(), CodeInsightBundle.message("generate.setter.template")), BorderLayout.SOUTH);
}
}
