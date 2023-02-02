//4
public class func{
public void getComponent(){
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(checkBox);
        CheckinHandlerUtil.disableWhenDumb(myProject, checkBox, "Code analysis is impossible until indices are up-to-date");
}
}
