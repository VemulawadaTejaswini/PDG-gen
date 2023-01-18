//42
public class func{
	public void readAdaptorsFile(File checkpoint){
    BufferedReader br = new BufferedReader(new InputStreamReader(
        new FileInputStream(checkpoint)));
    while ((cmd = br.readLine()) != null)
      processCommand(cmd);
    br.close();
}
}
