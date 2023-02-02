//56
public class func{
	public void readIndex(Reader reader,Set<String> entries){
    BufferedReader bufferedReader = new BufferedReader(reader);
    while ((line = bufferedReader.readLine()) != null) {
      entries.add(line);
    }
    reader.close();
}
}
