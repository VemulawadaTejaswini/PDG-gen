//34
public class func{
	public void addSamlServiceProvider(){
            URL url = new URL(spMetaDataUrl);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(3000);
            urlConnection.setReadTimeout(3000);
            Reader reader = new InputStreamReader(urlConnection.getInputStream());
            SamlExternalEntity samlEntity = idpConfigApi.addExternalSamlEntity(reader);
            FacesMessage facesMessage = new FacesMessage("SAML entity " + samlEntity.getEntityId() + " has been added.");
}
}
