//0
public class func{
	public void fromFilename(String filename){
        if (filename == null) return null;
        File file = new File(filename);
            if (file.exists()) url = file.toURI().toURL();
}
}
