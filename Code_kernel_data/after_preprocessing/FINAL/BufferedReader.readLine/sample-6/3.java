public class func{
public void getFeatureUnit(BufferedReader featureReader){
    String line = featureReader.readLine();
    if (line == null)
      return null;
    if (line.trim().equals(""))
      return "";
    StringTokenizer st = new StringTokenizer(line.trim());
    return st.nextToken();
}
}
