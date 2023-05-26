public class func{
public void toURLs(Vector<File> files){
        Vector<URL> r = new Vector<URL>(files.size());
        for (File f : files) {
            if(!f.exists()) return null;
            r.add(f.toURI().toURL());
        }
}
}
