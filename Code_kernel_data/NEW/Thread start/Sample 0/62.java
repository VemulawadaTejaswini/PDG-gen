//61
public class func{
	public void processDatanodesForShutdown(Collection<Thread> threads){
    for (int i = dataNodes.size()-1; i >= 0; i--) {    
      Thread st = new Thread(new ShutDownUtil(dataNodes.get(i)));
      st.start();
      threads.add(st);
    }
}
}
