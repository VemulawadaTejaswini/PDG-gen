public class dummy {
private byte[] getValidationCode() throws ClientProtocolException, IOException, HttpException {
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("uin", qq));
    params.add(new BasicNameValuePair("aid", "549000912"));
    params.add(new BasicNameValuePair(String.valueOf(Math.random()), ""));
    HttpGet request =
        new HttpGet("http://captcha.qq.com/getimage?" + StringUtils.join(params, "&"));
    request.addHeader(new BasicHeader("Referer", loginUi));
    request.addHeader(new BasicHeader("Accept-Language", "zh-cn,zh"));
    HttpResponse response = http.execute(request);
    if (!Http.isRequestSuccess(response)) {
      throw new SocialException("Step 5, get validation code image failed.");
    }
    return IOUtils.toByteArray(response.getEntity().getContent());
  }
}