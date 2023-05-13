public class dummy {

public Result<com.belerweb.social.weixin.bean.Media> get(String accessToken, String mediaId) {
    String url =
        "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=" + accessToken
            + "&media_id=" + mediaId;
    try {
      HttpResponse response = Http.CLIENT.execute(new HttpGet(url));
      Header disposition = response.getFirstHeader("Content-disposition");
      HttpEntity entity = response.getEntity();
      if (disposition == null) {
        return new Result<com.belerweb.social.weixin.bean.Media>(Error.parse(new JSONObject(IOUtils
            .toString(entity.getContent()))));
      }

      String fileName = disposition.getValue();
      fileName = fileName.substring(fileName.indexOf("\"") + 1, fileName.lastIndexOf("\""));
      com.belerweb.social.weixin.bean.Media media = new com.belerweb.social.weixin.bean.Media();
      media.setId(mediaId);
      media.setName(fileName);
      media.setContentType(entity.getContentType().getValue());
      media.setContent(IOUtils.toByteArray(entity.getContent()));
      return new Result<com.belerweb.social.weixin.bean.Media>(media);
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    }
  }

}