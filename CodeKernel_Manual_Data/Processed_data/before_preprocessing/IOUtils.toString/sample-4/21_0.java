public class dummy {

public static String responseToString(HttpResponse response) throws HttpException {
    HttpEntity entity = response.getEntity();
    String result = null;
    if (entity != null) {
      Charset charset = null;
      Header encoding = entity.getContentEncoding();
      if (encoding == null) {
        ContentType contentType = ContentType.get(entity);
        if (contentType != null) {
          charset = contentType.getCharset();
        }
      } else {
        charset = Charset.forName(encoding.getValue());
      }
      if (charset == null) {
        charset = getDefaultCharset();
      }
      try {
        result = IOUtils.toString(entity.getContent(), charset);
      } catch (Exception e) {
        throw new HttpException(e);
      }
      return result;
    } else {
      throw new HttpException("No response entity.");
    }
  }

}