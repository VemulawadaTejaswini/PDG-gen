public class func{
public void addComponent(JPanel contentPanel,JPanel resultPanel){
    final Splitter splitter = new Splitter(true, 0.3f, 0.2f, 0.7f);
    contentPanel.add(splitter, BorderLayout.CENTER);
    splitter.setFirstComponent(myMainPanel);
    splitter.setSecondComponent(resultPanel);
}
}
