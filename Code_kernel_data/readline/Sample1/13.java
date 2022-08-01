//12
public class func{
	public void readCustList(String fileName){
    BufferedReader is = new BufferedReader(new FileReader(fileName));
    while ((line = is.readLine()) != null) {
      custList.add(line);
    }
    is.close();
}
}
