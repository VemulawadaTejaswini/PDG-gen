//111
public class func{
	public void processBug(Element element,IFeed feed){
          feed.setHomepage(new URI(baseUri.getScheme(), baseUri.getAuthority(), "/show_bug.cgi", "id=" + child.getText(), baseUri.getFragment())); //$NON-NLS-1$ //$NON-NLS-2$
}
}
