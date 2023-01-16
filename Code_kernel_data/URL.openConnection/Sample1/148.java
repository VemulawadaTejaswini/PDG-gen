//147
public class func{
	public void writeResources(String srcPath,File cacheDir,String date){
        URL url = new URL(srcPath);
        URLConnection urlConnection = url.openConnection();
        long last = urlConnection.getLastModified();
        if (last != 0) {
            fileDate = Long.toString(last);
        }
        if (!cacheDir.canRead() || date == null || !date.equals(fileDate)) {
            recursiveDelete(cacheDir, false);
            unzip(urlConnection.getInputStream(), cacheDir);
        }
}
}
