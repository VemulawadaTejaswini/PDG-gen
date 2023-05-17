//147
public class func{
public void execute(){
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) request;
                String locationURL = authorizationRequest.getLocation() + "?" + authorizationRequest.asQueryParams();
                URL url = new URL(locationURL);
                HttpURLConnection c = (HttpURLConnection) url.openConnection();
                c.setInstanceFollowRedirects(true);
                c.connect();
                response.setStatusCode(c.getResponseCode());
                response.setResponseMessage(c.getResponseMessage());
}
}
