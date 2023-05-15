public class dummy {
public ValidationCode check() throws SocialException {
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("appid", "522005705"));
    params.add(new BasicNameValuePair("ptlang", "2052"));
    params.add(new BasicNameValuePair("js_type", "2"));
    params.add(new BasicNameValuePair("js_ver", "10009"));
    params.add(new BasicNameValuePair("r", String.valueOf(Math.random())));
    params.add(new BasicNameValuePair("uin", email));
    HttpGet request =
        new HttpGet("https://ssl.ptlogin2.qq.com/check?" + StringUtils.join(params, "&"));
    request.addHeader(new BasicHeader("Referer", "https://mail.qq.com/cgi-bin/loginpage?lang=cn"));
    request.addHeader(new BasicHeader("Accept-Language", "zh-cn,zh"));
    try {
      HttpResponse response = http.execute(request);
      StatusLine statusLine = response.getStatusLine();
      if (statusLine == null || statusLine.getStatusCode() != HttpStatus.SC_OK
          || response.getEntity() == null) {
        throw new SocialException(String.valueOf(statusLine));
      }
      String result = IOUtils.toString(response.getEntity().getContent());
      request.releaseConnection();
      return new ValidationCode(result);
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    }
  }
}