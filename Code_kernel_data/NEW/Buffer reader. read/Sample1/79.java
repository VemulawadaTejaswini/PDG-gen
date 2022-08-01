//78
public class func{
	public void getContents(File root,String file){
    while ((read = br.read(buffer)) != -1) {
      capture.write(buffer, 0, read);
    }
    return capture.toString();
}
}
