//12
public class func{
public void processProperties(final String arg,final String urlSpec){
            props.load(url.openConnection().getInputStream());
            STDERR.println(AppClientLogger.ROOT_LOGGER.cannotLoadProperties(url));
}
}
