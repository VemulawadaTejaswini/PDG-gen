//5
public class func{
	public void readFile(String fileName,boolean showExceptions){
      inFile = reader(fileName, false, showExceptions);
      if (inFile == null) return "";
      while ((len = inFile.read(buff)) >= 0)
        strb.append(buff, 0, len);
      inFile.close();
}
}
