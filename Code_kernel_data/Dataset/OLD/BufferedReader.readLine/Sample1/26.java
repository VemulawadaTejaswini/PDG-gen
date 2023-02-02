//25
public class func{
	public void describe(Reader contents,IContentDescription description){
    BufferedReader reader = new BufferedReader(contents);
    while((line = reader.readLine()) != null){
      if(line.indexOf("<" + this.tagName) >= 0){
        return VALID;
      }
    }
}
}
