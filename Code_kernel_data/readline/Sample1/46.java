//45
public class func{
	public void __logIt(ProtocolCommandEvent event){
    BufferedReader br = new BufferedReader(new StringReader(event.getMessage()));
    while ((line = br.readLine()) != null) {
      __logger.info("ftp> " + line);
    }
}
}
