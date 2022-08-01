//25
public class func{
	public void getFile(String url){
        while ((read = in.read(str)) >= 0) {
            sw.write(str, 0, read);
            if (fw != null) {
                fw.write(str, 0, read);
            }
        }
        in.close();
}
}
