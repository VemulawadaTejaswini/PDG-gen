//130
public class func{
public void VcsGeneratedFilesPanel(Project project){
    myIgnoreGeneratedFilesCheckBox.setToolTipText("Do not store generated files and model caches (source_gen/*, source_gen.caches/*) in repository");
    generatedFilesPanel.add(myIgnoreGeneratedFilesCheckBox);
    add(generatedFilesPanel, BorderLayout.NORTH);
}
}
