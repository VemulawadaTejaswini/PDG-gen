public class func{
public void createDescriptionPanel(){
        descriptionTextArea = new JTextArea(8, 70);
        descriptionTextArea.setEditable(false);
        descriptionPanel.add(new JScrollPane(descriptionTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), BorderLayout.CENTER);
}
}
