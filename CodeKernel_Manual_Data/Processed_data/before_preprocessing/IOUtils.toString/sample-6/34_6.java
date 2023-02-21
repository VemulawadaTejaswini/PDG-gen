public class dummy {

  private String parseResponseAsString(HttpResponse response) throws APIException {
    try {
      return IOUtils.toString(parseResponseGeneral(response));
    } catch (IOException e) {
      throw new APIException(null, e);
    } 
  }

}