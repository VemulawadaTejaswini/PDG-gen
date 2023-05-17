public class func{
public void createContentPane(){
        builder.append("Git-Integration", gitIntegration = new JBLabel());
        builder.append("Current Heroku-Git-Remote:", remoteLabel = new JBLabel());
        panel.add(builder.getPanel(), BorderLayout.NORTH);
}
}
