//46
public class func{
	public void setUp(){
    if(m_topologyProvider == null) {
      m_topologyProvider = new SimpleGraphProvider();
      m_topologyProvider.setTopologyLocation(new File("target/test-classes/graph.xml").toURI());
    }
    m_topologyProvider.resetContainer();
}
}
