public class func{
public void TorrentFetcherDownload(TransferManager manager,TorrentDownloadInfo info){
        Thread t = new Thread(new FetcherRunnable(), "Torrent-Fetcher - " + info.getTorrentUrl());
        t.setDaemon(true);
        t.start();
}
}
