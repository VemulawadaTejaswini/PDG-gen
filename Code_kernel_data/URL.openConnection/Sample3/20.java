//19
public class func{
	public void getContent(){
      URL resourceURL = _servletContext.getResource(_resourcePath);
      if (resourceURL == null) {
        return null;
      }
      URLConnection urlConnection = resourceURL.openConnection();
      return StringUtil.read(urlConnection.getInputStream());
}
}
