public void dummy {

  private InputStream parseResponseGeneral(HttpResponse response) throws APIException {
    InputStream result;
    try {
      result = response.getEntity().getContent();
    } catch (IOException e) {
      throw new APIException(null, e);
    } 
    if (response.getStatusLine().getStatusCode() != 200)
      try {
        throw new APIException(IOUtils.toString(result), null);
      } catch (IOException e) {
        throw new APIException(null, e);
      }  
    return result;
  }

}