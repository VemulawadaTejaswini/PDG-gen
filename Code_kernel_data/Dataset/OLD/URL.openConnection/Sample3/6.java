//5
public class func{
	public void reload(URL url){
        if (url != null)
        {
            URLConnection connection = url.openConnection();
            if (connection != null)
            {
                connection.setUseCaches(false);
                return connection.getInputStream();
            }
        }
}
}
