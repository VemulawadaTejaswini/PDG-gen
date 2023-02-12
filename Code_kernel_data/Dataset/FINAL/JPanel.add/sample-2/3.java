public class func{
public void getComponent(){
          final JPanel cbPanel = new JPanel(new BorderLayout());
          cbPanel.add(cleanupCodeCb, BorderLayout.WEST);
          CheckinHandlerUtil
            .disableWhenDumb(myProject, cleanupCodeCb, "Code analysis is impossible until indices are up-to-date");
}
}
