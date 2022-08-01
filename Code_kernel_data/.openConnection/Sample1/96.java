//95
public class func{
	public void getEutilsInputStream(String accessionID,String db){
        logger.trace("Loading: {}", genbankURL);
        URL genbank = new URL(genbankURL);
        URLConnection genbankConnection = genbank.openConnection();
        return genbankConnection.getInputStream();
}
}
