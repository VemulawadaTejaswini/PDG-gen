//62
public class func{
	public void processDatanodesForShutdown(Collection<Thread> threads){
    for (int i = 0; i < dataNodes.size(); i++) {
      LOG.info("Shutting down data node " + i);
      Thread st = new Thread(new ShutDownUtil(dataNodes.get(i)));
      st.start();
      threads.add(st);
    }
}
}
