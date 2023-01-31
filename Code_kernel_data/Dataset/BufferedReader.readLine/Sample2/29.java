//28
public class func{
	public void skipBlock(BufferedReader in){
    String buffer = in.readLine();
    while(buffer != null)
    {
      if(buffer.startsWith("$"))
        return;
      buffer = in.readLine();
    }
}
}
