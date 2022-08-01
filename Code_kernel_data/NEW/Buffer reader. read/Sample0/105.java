//104
public class func{
	public void readEnclosingLine(String filename,int start,int end){
      BufferedReader in = new BufferedReader(new InputStreamReader(
          new FileInputStream(filename), "UTF-8"));
      while ((len = in.read(buf)) != -1) {
        text.append(buf, 0, len);
      }
      while (lineEnd < text.length() && lineEnd <= start) {
        lineStart = lineEnd;
        lineEnd = parseLine(text, lineEnd);
        line = line + 1;
      }
}
}
