//26
public class func{
	public void load(String file){
    BufferedReader br = new BufferedReader(new FileReader(file));
    while ((line = br.readLine()) != null) {
      String[] parts = line.split(", ");
      map.put(Long.parseLong(parts[0]), Integer.parseInt(parts[1]));
    }
}
}
