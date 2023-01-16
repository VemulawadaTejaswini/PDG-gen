//90
public class func{
	public void getXMLStream(String XMLurl){
    URL url= new URL(XMLurl);
    URLConnection jiraSite = url.openConnection();
    return jiraSite.getInputStream();
}
}
