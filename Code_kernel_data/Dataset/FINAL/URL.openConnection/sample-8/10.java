public class func{
public void create(URL file){
            URLConnection conn = file.openConnection();
            jar = new JarInputStream(conn.getInputStream());
            Manifest manifest = jar.getManifest();
            if (manifest == null) {
                throw new IOException(file + " is not a valid JAR file: Manifest not first entry");
            }
            return new Resource(file, manifest.getMainAttributes(),
}
}
