public class func{
public void go(){
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    while ((line = in.readLine()) != null) {
      String out = line.replace(find, replace);
      System.out.println(out);
    }
}
}
