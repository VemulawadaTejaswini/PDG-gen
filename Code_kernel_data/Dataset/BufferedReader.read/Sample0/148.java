//147
public class func{
	public void readFileFromClassPath(String filename){
      BufferedReader br = new BufferedReader(new InputStreamReader(
          Export.class.getClassLoader().getResourceAsStream(filename)));
      for (int c = br.read(); c != -1; c = br.read()) 
        sb.append((char)c);
}
}
