//1
public class func{
public void buildSelectedPrimitivesPanel(){
        pnl.add(new JScrollPane(lstSelectedPrimitives = new OsmPrimitiveList()), BorderLayout.CENTER);
        lbl.setLabelFor(lstSelectedPrimitives);
}
}
