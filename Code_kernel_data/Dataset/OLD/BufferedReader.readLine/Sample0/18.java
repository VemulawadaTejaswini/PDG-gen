//17
public class func{
	public void runConsole(){
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    while((s = in.readLine()) != null) {
      dump(s, false);
      System.out.print("> ");
    }
}
}
