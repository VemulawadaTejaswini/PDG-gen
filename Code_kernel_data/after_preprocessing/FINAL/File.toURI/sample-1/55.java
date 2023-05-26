public class func{
public void createCatalog(ResourceUtils ru,File tmpJar){
        String catalog = catalogTemplate.replace("${osgi-entities-path}", tmpJar.toURI().toString());
}
}
