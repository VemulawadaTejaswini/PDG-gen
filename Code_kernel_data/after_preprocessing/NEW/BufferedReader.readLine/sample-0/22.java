//22
public class func{
public void loadFile(String resourcePath){
  BufferedReader r = new BufferedReader(new InputStreamReader(in, Charset.forName("utf-8")));
  while ((nextLine = r.readLine()) != null) {
      w.write(nextLine);
      w.write(String.format("%n")); // platform dependent newline character
  }
}
}
