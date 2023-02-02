//23
public class func{
	public void readStreamAsString(final InputStream iStream){
    final BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);

        if (fileData.length() == 0 && readData.startsWith(UTF8_BOM))
          // SKIP UTF-8 BOM IF ANY
          readData = readData.substring(1);

        fileData.append(readData);
      }
      reader.close();
}
}
