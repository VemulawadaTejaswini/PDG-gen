//155
public class func{
	public void loadTipFile(String tipsFilePath){
    final File tipsFile = new File(tipsFilePath);
    final BufferedReader tipsReader = new BufferedReader(new InputStreamReader(new FileInputStream(tipsFile),
        "UTF-8"));
    final int length = (int) tipsFile.length();
    tipsReader.read(inputLine, 0, length);
    tipsReader.close();
}
}
