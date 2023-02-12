public class func{
public void readLines(File f){
    BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
    String line = bufferedReader.readLine();
    while (line != null) {
      fileLines.add(line);
      line = bufferedReader.readLine();
    }
}
}
