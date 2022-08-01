//263
public class func{
	public void actionPerformed(java.awt.event.ActionEvent actionEvent){
                        org.osid.repository.PartIterator partIterator = mRecord.getParts();
                        while (partIterator.hasNextPart()) {
                            org.osid.repository.Part part = partIterator.nextPart();
                            String fedoraUrl = part.getValue().toString();
                            URL url = new URL(fedoraUrl);
                            URLConnection connection = url.openConnection();
                            tufts.Util.openURL(fedoraUrl);
                            break;
                            
                        }
}
}
