//139
public class func{
public void parseWaypointLines(BufferedReader reader){
    while ((line = reader.readLine()) != null) {
      try {
        parseLine(line);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}
}
