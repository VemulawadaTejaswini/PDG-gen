public class func{
public void getLabelUnit(BufferedReader labelReader){
    String line = labelReader.readLine();
    if (line == null)
      return null;
    StringTokenizer st = new StringTokenizer(line.trim());
    return st.nextToken();
}
}
