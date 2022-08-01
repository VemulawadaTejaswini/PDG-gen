//81
public class func{
	public void collectLines(ArrayList<String> lines,BufferedReader reader){
    while (null != (line = reader.readLine())) {
      line = line.trim();
      if (line.length() > 0 && !line.startsWith("#")) {
        for (String arg : line.split("\\s+")) {
          lines.add(arg);
        }
      }
    }
}
}
