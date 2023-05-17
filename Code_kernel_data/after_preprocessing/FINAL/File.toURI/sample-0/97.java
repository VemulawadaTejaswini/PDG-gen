public class func{
public void parseConfig(RendererConfBuilder builder){
        userAgent = FopFactory.newInstance(
                new File(".").toURI(), builder.endRendererConfig().build()).newFOUserAgent();
}
}
