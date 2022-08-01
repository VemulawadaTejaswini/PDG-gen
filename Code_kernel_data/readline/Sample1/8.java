//7
public class func{
	public void readInputFile(File input){
    BufferedReader br = new BufferedReader(new FileReader(input));
    while ((line = br.readLine()) != null) {
       line = line.toLowerCase().trim();
       out.add(line);
    }
    br.close();
}
}
