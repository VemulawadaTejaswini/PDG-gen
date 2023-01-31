//17
public class func{
	public void readFile(String path){
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
        String sCurrentLine = br.readLine();
        while (sCurrentLine != null) {
            sb.append(sCurrentLine);
            sCurrentLine = br.readLine();
        }
}
}
