public class func{
public void buildQueryEditor(){
        panel.add(UISupport.getEditorFactory().buildXPathEditor(queryEditorModel), BorderLayout.CENTER);
        UISupport.addTitledBorder(panel, "XPath Query");
}
}
