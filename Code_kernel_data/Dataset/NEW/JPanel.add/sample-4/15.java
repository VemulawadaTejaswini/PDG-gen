//15
public class func{
public void addValidateButton(final Action action){
    validatePanel.add( new JButton( action ), BorderLayout.EAST );
    validatePanel.add( statusText, BorderLayout.CENTER );
    panel.add( validatePanel, BorderLayout.SOUTH );
}
}
