public class func{
public void componentFor(Object o){
        SmartVanillaViewer subview=new SmartVanillaViewer(tc.multiClassifier);
        subview.setSuperView(this);
        panel.add(subview);
        return(new JScrollPane(panel));
}
}
