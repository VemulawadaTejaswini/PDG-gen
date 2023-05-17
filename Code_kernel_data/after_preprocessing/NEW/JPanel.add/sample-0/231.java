//231
public class func{
public void createQueryPanel(){
        querySplit = UISupport.createVerticalSplit(buildQueryTabs(), buildInputArea());
        querySplit.setBorder(null);
        querySplit.setResizeWeight(0.2);
        panel.add(querySplit, BorderLayout.CENTER);
}
}
