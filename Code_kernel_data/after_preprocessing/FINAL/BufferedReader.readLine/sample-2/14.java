public class func{
public void loadTextFile(final String location,final List<String> list){
    final BufferedReader reader = new BufferedReader(getReader(location));
    String line = reader.readLine();
    while (line != null) {
      list.add(line);
      line = reader.readLine();
    }
}
}
