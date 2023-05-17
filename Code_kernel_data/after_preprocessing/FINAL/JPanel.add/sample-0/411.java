public class func{
public void createButtonsPanel(){
        removeButton = ToolButtonFactory.createButton(new RemoveAliasAction(), false);
        removeButton.setEnabled(false);
        buttonsPanel.add(removeButton, BorderLayout.SOUTH);
}
}
