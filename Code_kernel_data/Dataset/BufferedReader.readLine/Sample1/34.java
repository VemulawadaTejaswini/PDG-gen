//33
public class func{
	public void extractList(String fileName){
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    while ((ln = br.readLine()) != null) {
      res.add(Integer.parseInt(ln));
    }
}
}
