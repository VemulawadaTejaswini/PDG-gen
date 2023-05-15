public class dummy {
private byte[] parseResponseAsByteArray(HttpResponse response) throws APIException {
    try {
      return IOUtils.toByteArray(parseResponseGeneral(response));
    } catch (IOException e) {
      throw new APIException(null, e);
    } 
  }
}