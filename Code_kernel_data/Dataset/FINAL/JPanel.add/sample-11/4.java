public class func{
public void createComponent(){
    final JPanel panel = new JPanel(new GridLayout(myFields.size(), 1));
    for (BeanField field: myFields) {
      panel.add(field.getComponent());
    }
}
}
