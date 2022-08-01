//63
public class func{
	public void processNamenodesForShutdown(Collection<Thread> threads){
    for (NameNodeInfo nnInfo : nameNodes) {
      Thread st = new Thread(new ShutDownUtil(nnInfo));
      st.start();
      threads.add(st);
    }
}
}
