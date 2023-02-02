//64
public class func{
public void encode(final RestRequest request,RequestContext requestContext,int threshold){
    uri = new URI(uri.getScheme(),
                  uri.getUserInfo(),
                  uri.getHost(),
                  uri.getPort(),
                  uri.getPath(),
                  null,
                  uri.getFragment());
    ByteString entity = request.getEntity();
    if (entity == null || entity.length() == 0)
    {
      requestBuilder.setHeader(HEADER_CONTENT_TYPE, FORM_URL_ENCODED);
      requestBuilder.setEntity(ByteString.copyString(query, Data.UTF_8_CHARSET));
    }
    else
    {
      // If we have a body, we must preserve it, so use multipart/mixed encoding

      MimeMultipart multi = createMultiPartEntity(entity, request.getHeader(HEADER_CONTENT_TYPE), query);
      requestBuilder.setHeader(HEADER_CONTENT_TYPE, multi.getContentType());
      ByteArrayOutputStream os = new ByteArrayOutputStream();
      multi.writeTo(os);
      requestBuilder.setEntity(ByteString.copy(os.toByteArray()));
    }
}
}
