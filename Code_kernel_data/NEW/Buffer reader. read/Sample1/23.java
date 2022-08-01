//22
public class func{
	public void showFileInfo(String filename){
      while ((read = br.read(buffer)) > 0) {
        output.append(buffer, 0, read);
      }
      br.close();
}
}
