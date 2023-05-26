//42
public class func{
public void retrieveSfdcSessionId(){
        refreshConsumerAndProvider();
        final URL loginUrl = new URL(getSfdcLoginUrl());
        request = (HttpURLConnection) loginUrl.openConnection();
        request.setRequestMethod("POST");
        consumer.sign(request);
        request.connect();
        final String loginResult = new Scanner(request.getInputStream()).useDelimiter("\\A").next();
}
}
