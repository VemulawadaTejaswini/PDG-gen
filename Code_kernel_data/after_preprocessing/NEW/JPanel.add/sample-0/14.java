//14
public class func{
public void addLabeledV(JComponent target,String text,JPanel owner){
    JPanel p = new JPanel();
    p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
    p.add(target);
    owner.add(p);
}
}
