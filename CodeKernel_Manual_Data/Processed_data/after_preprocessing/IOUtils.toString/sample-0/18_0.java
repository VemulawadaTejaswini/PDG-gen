public class dummy {
  private String internalGet(URL get) throws IOException, ClientProtocolException, URISyntaxException {
    HttpUriRequest request = RequestBuilder.get().setUri(get.toURI()).setHeader("User-Agent", this.userAgent).build();
    CloseableHttpResponse execute = this.httpclient.execute(request);
    HttpEntity entity = execute.getEntity();
    InputStream contentIS = entity.getContent();
    Header contentType = entity.getContentType();
    HeaderElement[] elements = contentType.getElements();
    HeaderElement headerElement = elements[0];
    NameValuePair parameterByName = headerElement.getParameterByName("charset");
    String encoding = "UTF-8";
    if (parameterByName != null)
      encoding = parameterByName.getValue(); 
    if (encoding != null && encoding.equals("ISO-8859-1"))
      encoding = "CP1252"; 
    String content = IOUtils.toString(contentIS, encoding);
    contentIS.close();
    return content;
  }
}
