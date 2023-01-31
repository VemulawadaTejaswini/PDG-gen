//16
public class func{
	public void readStream(InputStream input){
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      while ((line = reader.readLine()) != null) {
        LOG.info(line);
      }
}
}
