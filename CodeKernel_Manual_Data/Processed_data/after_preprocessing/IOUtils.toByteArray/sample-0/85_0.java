public class dummy {
public byte[] getValidationCode() throws SocialException {
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("aid", "522005705"));
    params.add(new BasicNameValuePair("r", String.valueOf(Math.random())));
    params.add(new BasicNameValuePair("uin", email));
    HttpGet request =
        new HttpGet("https:
    request.addHeader(new BasicHeader("Referer", "https:
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