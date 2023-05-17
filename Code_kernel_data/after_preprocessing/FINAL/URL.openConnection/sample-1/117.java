public class func{
public void main(String[] args){
            File f = File.createTempFile("test", null);
            f.deleteOnExit();
            String s = f.getAbsolutePath();
            s = s.startsWith("/") ? s : "/" + s;
            URL url = new URL("file:
            conn = url.openConnection();
            conn.connect();
            if (f.lastModified() != conn.getLastModified())
                throw new RuntimeException("file.lastModified() & FileURLConnection.getLastModified() should be equal");
            f.delete();
}
}
