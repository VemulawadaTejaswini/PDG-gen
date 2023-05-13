public class dummy {

public Result<com.belerweb.social.weixin.bean.Media> upload(String accessToken, MediaType type,
      com.belerweb.social.weixin.bean.Media media) {
    String url =
        "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=" + accessToken + "&type="
            + type.value();
    HttpPost request = new HttpPost(url);
    MultipartEntityBuilder builder =
        MultipartEntityBuilder.create().addBinaryBody("media", media.getContent(),
            ContentType.create(media.getContentType()), media.getName());
    request.setEntity(builder.build());
    try {
      HttpResponse response = Http.CLIENT.execute(request);
      String json = IOUtils.toString(response.getEntity().getContent());
      JSONObject jsonObject = new JSONObject(json);
      Error error = Error.parse(jsonObject);
      if (error != null) {
        return new Result<com.belerweb.social.weixin.bean.Media>(error);
      }
      media.setId(jsonObject.getString("media_id"));
      return new Result<com.belerweb.social.weixin.bean.Media>(media);
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    }
  }

}