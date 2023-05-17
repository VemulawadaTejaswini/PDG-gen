public class func{
public void should_throw_exception_if_url_not_found(){
    URLs.contentOf(missingFile.toURI().toURL(), Charset.defaultCharset());
}
}
