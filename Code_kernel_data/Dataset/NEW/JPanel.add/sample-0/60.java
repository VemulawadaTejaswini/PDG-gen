//60
public class func{
public void buildUI(){
    this.progress.setBorder(BorderFactory.createEmptyBorder(10, 13, 10, 13));
    this.progress.setPreferredSize(new Dimension(PREFERRED_WIDTH, this.progress.getPreferredSize().height));
    content.add(this.progress, BorderLayout.CENTER);
    this.frame.setContentPane(content);
}
}
