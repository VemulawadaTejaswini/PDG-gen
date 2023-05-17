//35
public class func{
public void getURLcode(String htmlPage){
            String url = "http://" + TestSuiteEnvironment.getServerAddress() + ":8080/explodedDeployment/"
            logger.infof("%s is the built URL.", url);
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            code = urlConnection.getResponseCode();
            logger.infof("Received response code of: " + code);
}
}
