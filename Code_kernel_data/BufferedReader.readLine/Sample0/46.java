//45
public class func{
	public void readFrom(String path){
    File file = new File(path);
    System.out.println("Trying to load accessToken from file " + file.getAbsolutePath());
    FileInputStream fis = new FileInputStream(file);
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);
    String token = br.readLine();
    br.close();
}
}
