public class func{
public void disableUrlConnectionCaching(){
            URL url = new URL("jar:file:
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDefaultUseCaches(false);
}
}
