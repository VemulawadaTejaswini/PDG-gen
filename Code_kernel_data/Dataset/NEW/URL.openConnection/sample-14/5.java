//5
public class func{
public void getReader(Object name,String encoding){
            URL url = getClass().getClassLoader().getResource( String.valueOf( name ) );
            URLConnection connection = url.openConnection();
            connection.setUseCaches( false );
            InputStream is = connection.getInputStream();
}
}
