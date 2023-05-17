//103
public class func{
public void getLines(BufferedReader br){
    while ((line = br.readLine()) != null) {
      if (!line.startsWith("#")) {
        lines.add(line.getBytes("utf-8"));
      }
    }
}
}
