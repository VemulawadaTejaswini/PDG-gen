//60
public class func{
	public void getFile(String host){
      final URL url = new URL(host);
      final URLConnection connection = url.openConnection();
      input = connection.getInputStream();
      while ((read = input.read(buffer)) > 0) {
        image.write(buffer, 0, read);
      }
      image.close();
      return image.toByteArray();
}
}
