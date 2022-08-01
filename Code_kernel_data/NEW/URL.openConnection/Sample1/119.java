//118
public class func{
	public void readerFor(String fileName){
        if (fileName==null) return null;
        if (fileName.startsWith("http") || fileName.startsWith("file:")) {
            URL url = new URL(fileName);
            URLConnection conn = url.openConnection();
            long size = conn.getContentLengthLong();
            Reader reader = new InputStreamReader(url.openStream(),"UTF-8");
            return new CountingReader(reader,size);
        }
        File file = new File(fileName);
        if (!file.exists() || !file.isFile() || !file.canRead()) throw new IOException("Cannot open file "+fileName+" for reading.");
        return new CountingReader(file);
}
}
