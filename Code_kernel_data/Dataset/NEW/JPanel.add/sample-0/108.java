//108
public class func{
public void buildPropertiesPanel(){
        propertiesTable = new PropertyHolderTable(getModelItem());
        if (getModelItem() instanceof WsdlProject) {
            ((WsdlProject) getModelItem()).addProjectListener(propertiesTable.getProjectListener());
        }
        panel.add(propertiesTable, BorderLayout.CENTER);
}
}
