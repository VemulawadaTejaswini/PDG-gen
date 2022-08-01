//74
public class func{
	public void consumeIDs(URLConnection connection,FastIDSet result){
    BufferedReader reader = IOUtils.bufferStream(connection.getInputStream());
      while ((line = reader.readLine()) != null) {
        result.add(Long.parseLong(line));
      }
      reader.close();
}
}
