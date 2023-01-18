//269
public class func{
	public void startTransactionWorkers(FSNamesystem namesystem,AtomicReference<Throwable> caughtErr){
      Transactions trans = new Transactions(namesystem, caughtErr);
      new Thread(trans, "TransactionThread-" + i).start();
}
}
