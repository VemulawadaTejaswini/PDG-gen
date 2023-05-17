public class func{
public void buildMatchEditor(){
        panel.add(UISupport.getEditorFactory().buildXmlEditor(matchEditorModel), BorderLayout.CENTER);
        UISupport.addTitledBorder(panel, "Matching Value");
}
}
