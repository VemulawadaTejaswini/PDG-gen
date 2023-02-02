//12
public class func{
public void ZipArchiveWrapper(File zipFile){
        if (zipFile == null) {
            throw new FileNotFoundException("Zip file was null!");
        }
        zipUrl = zipFile.toURI().toURL();
}
}
