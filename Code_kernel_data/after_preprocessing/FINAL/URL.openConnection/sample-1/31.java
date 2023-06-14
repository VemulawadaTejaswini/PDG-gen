public class func{
public void download(String lib){
        File libFile = new File(libDir, fileName(lib));
            URL libDownload = new URL("http://repo1.maven.org/maven2/"+lib);
            URLConnection connection = libDownload.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestProperty("User-Agent", "CodeChickenLib Downloader");
            int sizeGuess = connection.getContentLength();
            download(connection.getInputStream(), sizeGuess, libFile);
            libFile.delete();
}
}
