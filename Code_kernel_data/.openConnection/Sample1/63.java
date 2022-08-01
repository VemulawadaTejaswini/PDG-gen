//62
public class func{
	public void loadMetaDataOfOtherSamlEntity(String hostName,String idpOrSp){
            URL url = new URL("http://localhost:8080/" + idpOrSp + "/saml/" + idpOrSp.toUpperCase() + "/MetaDataService");
            uc = url.openConnection();
            uc.setRequestProperty("host", hostName);
            Reader reader = new InputStreamReader(uc.getInputStream());
}
}
