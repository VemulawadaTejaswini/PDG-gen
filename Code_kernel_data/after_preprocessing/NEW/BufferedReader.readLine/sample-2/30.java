//30
public class func{
public void parseCodeRangeMappingSection(BufferedReader bf){
    String line = bf.readLine();
    while (line != null) {
      if (line.contains("endcodespacerange")) {
        break;
      }
      parseCodeRangeLine(line);
      line = bf.readLine();
    }
}
}
