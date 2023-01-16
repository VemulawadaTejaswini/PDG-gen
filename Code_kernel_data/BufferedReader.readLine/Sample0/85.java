//84
public class func{
	public void promptForPath(CommandRunnerParams params,String prompt){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String path = br.readLine();
    if (path != null) {
      return expandTilde(path.trim());
    }
}
}
