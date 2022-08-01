//38
public class func{
	public void loadTags(OpenObjectIntHashMap<String> tags){
    BufferedReader reader = new BufferedReader(new FileReader(countFile));
    while ((line = reader.readLine()) != null) {
      int pos = line.lastIndexOf('\t');
      String tag = new String(line.substring(pos+1));
      tags.adjustOrPutValue(tag, 0, 0);
    }
}
}
