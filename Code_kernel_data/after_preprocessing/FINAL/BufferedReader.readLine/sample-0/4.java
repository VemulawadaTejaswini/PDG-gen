public class func{
public void readAdaptorsFile(File checkpoint){
    log.info("starting adaptors listed in " + checkpoint.getAbsolutePath());
    BufferedReader br = new BufferedReader(new InputStreamReader(
        new FileInputStream(checkpoint)));
    while ((cmd = br.readLine()) != null)
      processAddCommand(cmd);
    br.close();
}
}
