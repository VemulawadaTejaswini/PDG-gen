//91
public class func{
	public void getContents(InputStream inputStream){
    while( (line = reader.readLine())!=null ) {
      contents.append(line);
      contents.append("\n");
    }
    return contents.toString();
}
}
