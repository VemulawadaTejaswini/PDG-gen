//6
public class func{
public void NASASourceManager(){
            URLConnection connection = url.openConnection();            
            Document dom = builder.build(connection.getInputStream());
            Element root = dom.getRootElement();                    
            tiledPatterns = root.getChild("TiledPatterns"); //$NON-NLS-1$
}
}
