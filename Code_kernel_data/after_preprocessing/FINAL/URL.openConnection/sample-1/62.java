public class func{
public void loadMetaDataOfOtherSamlEntity(String hostName,String idpOrSp){
            URL url = new URL("http:
            uc = url.openConnection();
            uc.setRequestProperty("host", hostName);
            Reader reader = new InputStreamReader(uc.getInputStream());
}
}
