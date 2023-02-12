public class func{
public void checkServer(){
        final URL checkURL = new URL(fURL + "/dummy.php"); //$NON-NLS-1$
        URLConnection connection = checkURL.openConnection();
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(DEFAULT_TIMEOUT);
        inputStream = connection.getInputStream();
        if (inputStream != null) {
          inputStream.close();
        }
}
}
