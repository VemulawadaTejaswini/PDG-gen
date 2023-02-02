//73
public class func{
	public void go(int seconds){
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    while ((line = in.readLine()) != null) {
      Thread.sleep(seconds * 1000L);
      System.out.println(line);
    }
}
}
