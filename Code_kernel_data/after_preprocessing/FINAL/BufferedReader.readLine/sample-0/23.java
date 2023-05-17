public class func{
public void W3CLogParser(InputStream is){
    BufferedReader buf = new BufferedReader(new InputStreamReader(is));
    while ((line = buf.readLine()) != null) {
      List<String> fields = Arrays.asList(line.split(DELIMITER));
      fieldDef_.put(fields.get(0), fields.subList(1, fields.size()));
    }
}
}
