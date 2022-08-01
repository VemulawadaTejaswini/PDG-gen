//84
public class func{
	public void updateTextField(){
                URI uri = new URI(textField.getText());
                String fragment = uri.getFragment();
                if (fragment != null) {
                    textField.setText(fragment);
                }
                else {
                    textField.setText(getFragment());
                }
}
}
