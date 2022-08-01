//4
public class func{
	public void performCheck(File file){
      BufferedReader in = new BufferedReader(new FileReader(file));
      while ((line = in.readLine()) != null) {
        if (line.trim().length() > 0)
          total++;
      }
      in.close();
}
}
