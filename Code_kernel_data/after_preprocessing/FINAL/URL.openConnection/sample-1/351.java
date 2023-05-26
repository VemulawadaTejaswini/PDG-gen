public class func{
public void download(Dependency dep){
                URL libDownload = new URL(dep.repo + dep.file.filename);
                downloadMonitor.updateProgressString("Downloading file %s", libDownload.toString());
                logger.info("Downloading file " + libDownload.toString());
                URLConnection connection = libDownload.openConnection();
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestProperty("User-Agent", "" + owner + " Downloader");
                download(connection.getInputStream(), connection.getContentLength(), dep);
}
}
