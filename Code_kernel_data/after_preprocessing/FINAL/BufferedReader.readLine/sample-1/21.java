public class func{
public void readFileLines(String filename){
    File file = new File(filename);
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while((line = reader.readLine()) != null) {
      lines.add(line);
    }
}
}
