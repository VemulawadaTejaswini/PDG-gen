public class func{
public void codeLocation(){
        String outputDirectory = outputDirectory();
            return outputDirectory != null ? new File(outputDirectory).toURI().toURL() : null;
}
}
