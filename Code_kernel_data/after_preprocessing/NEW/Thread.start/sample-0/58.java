//58
public class func{
public void scheduleIndexCreation(final Book book){
        Thread work = new Thread(new Runnable() {
            public void run() {
              IndexManager indexManager = IndexManagerFactory.getIndexManager();
              indexManager.setIndexPolicy(new AndroidIndexPolicy());
                indexManager.scheduleIndexCreation(book);
            }
        });
        work.start();
}
}
