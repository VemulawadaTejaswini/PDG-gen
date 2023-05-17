public class func{
public void buildCenterPanel(){
        model = new DefaultListModel<>();
        pnl.add(new JScrollPane(lstOpenChangesets = new JList<>(model)), BorderLayout.CENTER);
}
}
