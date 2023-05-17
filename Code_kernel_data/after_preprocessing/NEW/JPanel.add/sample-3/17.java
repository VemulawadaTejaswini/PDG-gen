//17
public class func{
public void addCard(JPanel panel,String type,String name){
        JEditorPane editor = new JTextPane();
        editor.setBackground(Color.WHITE);
        editor.setContentType(type);
        editor.setTransferHandler(new ParsingTransferHandler(
                editor.getTransferHandler(), this));
        panel.add(new JScrollPane(editor), name);
}
}
