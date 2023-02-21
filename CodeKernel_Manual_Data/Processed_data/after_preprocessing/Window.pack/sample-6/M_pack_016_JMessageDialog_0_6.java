public class A{
	public void setMessage( String m ) {
		if (msg == null)return;
		if (msg instanceof JLabel) {
			((JLabel)msg).setText( m );
		} else if (msg instanceof JTextComponent)((JTextComponent)msg).setText(m);
		pack();
		repaint();
	}
}