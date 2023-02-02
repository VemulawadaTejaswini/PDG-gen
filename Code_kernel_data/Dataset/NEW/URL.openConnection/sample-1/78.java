//78
public class func{
public void updateWeatherData(){
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            weatherData = IOUtils.toString(connection.getInputStream());
}
}
