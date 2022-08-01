//73
public class func{
	public void redirectOut(JTextArea displayPane){
  PipedOutputStream pos = new PipedOutputStream();
  System.setOut(new PrintStream(pos, true));
  ModConsole console = new ModConsole(displayPane, pos);
  new Thread(console).start();
}
}
