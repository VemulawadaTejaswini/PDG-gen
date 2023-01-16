//17
public class func{
	public void countLines(){
    BufferedReader buffRdr = new BufferedReader(new FileReader(
        this.graphFile));
    while (buffRdr.readLine() != null) {
      count++;
    }
    buffRdr.close();
}
}
