//72
public class func{
	public void printLines(final String what,final InputStream in){
    final BufferedReader r = new BufferedReader(new InputStreamReader(in));
    while ((line = r.readLine()) != null) {
      LOG.info('(' + what + ") " + line);
    }
}
}
