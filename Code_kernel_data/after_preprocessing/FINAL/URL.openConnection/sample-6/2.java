public class func{
public void getRootElementFromUrl(URL url){
        URLConnection connection = url.openConnection();            
        Document dom = builder.build(connection.getInputStream());
        return dom.getRootElement(); 
}
}
