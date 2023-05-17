public class func{
public void go(){
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    while ((line = in.readLine()) != null) {
      for (String part : line.split(find)) {
        writeString(part);
        writeInt(1);
      }
    }
}
}
