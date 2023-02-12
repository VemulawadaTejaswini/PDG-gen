public class func{
public void printTextFile(FileSystem fs,Path p){
    BufferedReader in = new BufferedReader(new InputStreamReader(fs.open(p)));
    while ((line = in.readLine()) != null) {
      System.out.println("  Row: " + line);
    }
    in.close();
}
}
