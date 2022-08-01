//158
public class func{
	public void doInitializationWork(){
            Thread t = new Thread(new InitializerWorker());
            t.start();
            m_initThreads.add(t);
        new InitializerWorker().run();
}
}
