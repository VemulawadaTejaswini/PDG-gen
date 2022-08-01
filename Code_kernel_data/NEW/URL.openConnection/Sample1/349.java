//348
public class func{
	public void getRSSConnection(final String url){
      rv = new URL(Optional.ofNullable(url).orElse("https://dailyfratze.de/michael/tags/Theme/Radtour?format=rss&dir=d")).openConnection();      
}
}
