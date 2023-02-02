//108
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class160.buildPropertiesPanel()#1{
        propertiesTable = new PropertyHolderTable(getModelItem());
        if (getModelItem() instanceof WsdlProject) {
            ((WsdlProject) getModelItem()).addProjectListener(propertiesTable.getProjectListener());
        }
        panel.add(propertiesTable, BorderLayout.CENTER);
}
}
