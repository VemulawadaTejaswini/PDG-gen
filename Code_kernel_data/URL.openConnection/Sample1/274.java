//273
public class func{
	public void actionPerformed(java.awt.event.ActionEvent actionEvent){
                        String fedoraUrl = mInfoRecord.getInfoField(new PID(FedoraUtils.getFedoraProperty(mDR, "DisseminationURLInfoPartId"))).getValue().toString();
                        URL url = new URL(fedoraUrl);
                        URLConnection connection = url.openConnection();
                        System.out.println("FEDORA ACTION: Content-type:"+connection.getContentType()+" for url :"+fedoraUrl);
}
}
