public class func{
public void getRootElement(){
            URLConnection connection = url.openConnection();
            Document dom = builder.build(connection.getInputStream());
            rootElement = dom.getRootElement();  
}
}
