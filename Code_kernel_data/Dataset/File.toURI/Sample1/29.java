//28
public class func{
	public void should_throw_exception_if_url_not_found(){
    URLs.linesOf(missingFile.toURI().toURL(), Charset.defaultCharset());
}
}
