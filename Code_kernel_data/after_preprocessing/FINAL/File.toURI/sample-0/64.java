public class func{
public void getSavedWsdlUrl(String fileBaseName,File targetFolder){
        File file = new File(targetFolder, fileBaseName + ".wsdl");
            return file.toURI().toURL();
}
}
