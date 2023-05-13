public class dummy {

public Result<NewT> addPicT(String accessToken, String oauthConsumerKey, String openId,
      String content, byte[] pic, String clientIp, Double lon, Double lat, Boolean sync,
      Boolean compatible) {
    HttpPost request = new HttpPost("https://graph.qq.com/t/add_pic_t");
    MultipartEntityBuilder builder = MultipartEntityBuilder.create().addBinaryBody("pic", pic);

    List<NameValuePair> params = new ArrayList<NameValuePair>();
    addParameter(params, "access_token", accessToken);
    addParameter(params, "oauth_consumer_key", oauthConsumerKey);
    addParameter(params, "openid", openId);
    addParameter(params, "content", content);
    addNotNullParameter(params, "clientip", clientIp);
    addNotNullParameter(params, "lon", lon);
    addNotNullParameter(params, "lat", lat);
    if (sync != null) {
      addParameter(params, "syncflag", sync ? "0" : "1");
    }
    if (compatible != null) {
      addParameter(params, "compatibleflag", compatible ? "0" : "0x20");
    }
    addParameter(params, "format", "json");

    for (NameValuePair nameValuePair : params) {
      builder.addTextBody(nameValuePair.getName(), nameValuePair.getValue());
    }
    request.setEntity(builder.build());
    try {
      HttpResponse response = Http.CLIENT.execute(request);
      String json = IOUtils.toString(response.getEntity().getContent());
      JSONObject jsonObject = new JSONObject(json);
      Error error = Error.parse(jsonObject);
      if (error != null) {
        return new Result<NewT>(error);
      }
      return Result.parse(jsonObject.getJSONObject("data"), NewT.class);
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    } finally {
      request.releaseConnection();
    }
  }

}