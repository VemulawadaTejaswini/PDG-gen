//13
public class func{
public void readFile(final String filename){
    final BufferedReader in = new BufferedReader(new FileReader(filename));
    while ((line = in.readLine()) != null) {
      contents += line;
    }
    in.close();
}
}
