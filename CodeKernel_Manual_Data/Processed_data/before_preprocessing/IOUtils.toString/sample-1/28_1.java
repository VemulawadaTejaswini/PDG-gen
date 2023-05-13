public class dummy {

public Result<String> decode(byte[] img, YundamaType type) {
    HttpPost request = new HttpPost("http://api.yundama.com/api.php?method=upload");
    MultipartEntityBuilder builder =
        MultipartEntityBuilder.create()
            .addBinaryBody("file", img, ContentType.create("image/png"), "code.png")
            .addTextBody("username", username).addTextBody("password", password)
            .addTextBody("codetype", type.getType().toString()).addTextBody("appid", appId)
            .addTextBody("appkey", appKey).addTextBody("timeout", "60");
    request.setEntity(builder.build());
    try {
      HttpResponse response = Http.CLIENT.execute(request);
      String json = IOUtils.toString(response.getEntity().getContent());
      request.releaseConnection();
      JSONObject jsonObject = new JSONObject(json);
      Integer ret = Result.parseInteger(jsonObject.get("ret"));
      if (ret == 0) {
        String url =
            "http://api.yundama.com/api.php?method=result&cid="
                + Result.toString(jsonObject.get("cid"));
        long start = System.currentTimeMillis();
        while (true) {
          jsonObject = new JSONObject(Http.get(url));
          if (Result.parseInteger(jsonObject.get("ret")) == 0) {
            return new Result<String>(Result.toString(jsonObject.get("text")));
          }
          if (System.currentTimeMillis() - start > 10000) {
            return new Result<String>(new Error("TIMEOUT", "验证码识别超时。"));
          }
          try {
            Thread.sleep(300);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
      Error error = new Error();
      error.setErrorCode(ret.toString());
      return new Result<String>(error);
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (HttpException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    }
  }

}