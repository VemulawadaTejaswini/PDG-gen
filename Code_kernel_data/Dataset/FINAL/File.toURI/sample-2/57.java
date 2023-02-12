public class func{
public void chooseImage(){
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(this);
    File file = fileChooser.getSelectedFile();
    Icon imageIcon = new ImageIcon(file.toURI().toURL());
    setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight() + 100);
    imageLabel.setIcon(imageIcon);
    String decodeText = getDecodeText(file);
    textArea.setText(decodeText);
}
}
