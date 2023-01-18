//26
public class func{
	public void validateIcon(Service service,String serviceFilePath){
    String icon = service.getIcon();
    if (icon.startsWith("http")) {
      HttpURLConnection connection = (HttpURLConnection) new URL(icon).openConnection();
      connection.setRequestMethod("HEAD");
      Assert.assertEquals("The icon URL cannot establish a connection", HttpURLConnection.HTTP_OK,
          connection.getResponseCode());
      connection.disconnect();
    }else{
      File iconFile = new File(serviceFilePath, service.getIcon());
      Assert.assertTrue("Icon file not found in location: " + iconFile.getAbsolutePath(), iconFile.exists());
    }
}
}
