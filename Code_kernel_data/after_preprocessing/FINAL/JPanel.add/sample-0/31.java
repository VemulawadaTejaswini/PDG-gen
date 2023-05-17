public class func{
public void createUsernameInput(){
        final JTextField textField = usernameField();
        topPanel.add(textField);
        topPanel.add(submitButton(textField));
        panel.add(topPanel, BorderLayout.NORTH);
}
}
