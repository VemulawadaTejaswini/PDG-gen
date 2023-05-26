public class func{
public void ClassLoaderTemplateResource(ClassLoader classLoader,String templateId){
    super(templateId, classLoader.getResource(templateId));
}
}
