//75
public class func{
	public void copyStreamToString(InputStream input,int approxStringLength){
    while ((charsRead = reader.read(buffer)) != -1) {
      w.write(buffer, 0, charsRead);
    }
    return w.toString();
}
}
