//104
public class func{
	public void scan(BufferedReader in){
      while((line=in.readLine())!=null)
          {
          if(line.isEmpty() || line.startsWith("#")) continue;
          analyze(new File(line));
          }
}
}
