public class func{
public void convertToLocalUrl(URL url){
        if (url.getProtocol().equals("bundle"))
        {
            try
            {
                url = ((URLHandlersBundleURLConnection)
                    url.openConnection()).getLocalURL();
            }
            catch (IOException ex)
            {
            }
        }
}
}
