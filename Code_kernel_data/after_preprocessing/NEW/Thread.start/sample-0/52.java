//52
public class func{
public void addNextToQueue(StructureListener listener){
    if ( installation.hasNext()){

      StructureFetcherRunnable r = new StructureFetcherRunnable(installation);
      r.addStructureListener(listener);
      Thread t = new Thread(r);
      t.start();
    }
}
}
