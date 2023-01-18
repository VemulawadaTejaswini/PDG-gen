//220
public class func{
	public void queryAtDServer(String text){
      URL url = new URL(urlPrefix + URLEncoder.encode(text, "UTF-8"));
      URLConnection conn = url.openConnection();
      conn.setRequestProperty("User-Agent", "AtDEvalChecker, contact daniel.naber " + atSign + " languagetool.org");
      InputStream contentStream = (InputStream) conn.getContent();
      return StringTools.streamToString(contentStream, "UTF-8");
}
}
