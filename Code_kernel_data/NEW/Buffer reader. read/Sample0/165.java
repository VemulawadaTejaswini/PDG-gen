//164
public class func{
	public void Read(File file,String encoding){
            BufferedReader in = new BufferedReader(new FileReader(file));
            char[] allChars = new char[(int) file.length()];
            in.read(allChars, 0, (int) file.length());
            in.close();
}
}
