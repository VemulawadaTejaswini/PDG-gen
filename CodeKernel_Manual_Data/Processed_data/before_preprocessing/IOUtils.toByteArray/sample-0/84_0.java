public class dummy {

public byte[] getValidationCode2() throws SocialException {
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("aid", "23000101"));
    params.add(new BasicNameValuePair("f", "html"));
    params.add(new BasicNameValuePair("ck", "1"));
    params.add(new BasicNameValuePair("r", String.valueOf(Math.random())));
    HttpGet request =
        new HttpGet("https://mail.qq.com/cgi-bin/getverifyimage?" + StringUtils.join(params, "&"));
    request.addHeader(new BasicHeader("Referer",
        "  https://mail.qq.com/cgi-bin/loginpage?errtype=3"));
    request.addHeader(new BasicHeader("Accept-Language", "zh-cn,zh"));
    try {
      HttpResponse response = http.execute(request);
      StatusLine statusLine = response.getStatusLine();
      if (statusLine == null || statusLine.getStatusCode() != HttpStatus.SC_OK
          || response.getEntity() == null) {
        throw new SocialException(String.valueOf(statusLine));
      }
      byte[] result = IOUtils.toByteArray(response.getEntity().getContent());
      request.releaseConnection();
      return result;
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    }
  }

}