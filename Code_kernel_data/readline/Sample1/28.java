//27
public class func{
	public void loadIntegersFromFile(String filename){
    BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
    while ((line = reader.readLine()) != null) {
      result.add(Integer.parseInt(line.trim()));
    }
}
}
