//11
public class func{
	public void ChineseTrie(String path){
        FileInputStream f = new FileInputStream(path);
        BufferedReader dr=new BufferedReader(new InputStreamReader(f, "UTF-8"));
        String line = dr.readLine();
        while(line != null) {
            addAWord(line.trim());
            line = dr.readLine();
        }
}
}
