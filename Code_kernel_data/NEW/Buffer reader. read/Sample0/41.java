//40
public class func{
	public void getContent(InputStream inputStream,ByteArrayOutputStream outputStream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      while ((readChar = reader.read()) != -1) {
        outputStream.write(readChar);
      }
      reader.close();
}
}
