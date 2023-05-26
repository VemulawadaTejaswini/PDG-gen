public class func{
public void startSearching(final AuctionHouse auctionHouse,final Set<String> keywords){
        Thread searchThread = new Thread(new Runnable() {
            public void run() {
                search(auctionHouse, keywords);
            }
        });
        searchThread.start();
}
}
