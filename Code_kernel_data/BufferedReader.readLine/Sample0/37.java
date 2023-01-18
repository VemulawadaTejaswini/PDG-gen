//36
public class func{
	public void regularReadIntoList(File file,List<String> stringList){
    FileInputStream fis = new FileInputStream(file);
    BufferedReader in = new BufferedReader(new InputStreamReader(fis));
    while ((line = in.readLine()) != null) {
      stringList.add(line);
    }
    in.close();
}
}
