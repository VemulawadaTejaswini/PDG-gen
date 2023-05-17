//99
public class func{
public void createCenterPanel(){
    JTextArea area = new JTextArea(5, 50);
    area.setText(myCertificateInfo);
    area.setEditable(false);
    panel.add(ScrollPaneFactory.createScrollPane(area), BorderLayout.CENTER);
}
}
