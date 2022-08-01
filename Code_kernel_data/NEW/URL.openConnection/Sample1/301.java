//300
public class func{
	public void testLink(){
    final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "linkTest.xdoc"));
    AbstractSection _mainSection = file.getMainSection();
    EList<TextOrMarkup> _contents = _mainSection.getContents();
    TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
    EList<EObject> _contents_1 = _head.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    final Link link = ((Link) _head_1);
    String _url = link.getUrl();
    final URL url = new URL(_url);
    final URLConnection connection = url.openConnection();
    Assert.assertNotNull(connection);
}
}
