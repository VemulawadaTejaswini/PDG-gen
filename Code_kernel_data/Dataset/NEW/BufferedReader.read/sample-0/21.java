//21
public class func{
public void fileToString(String path){
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
      while((c = reader.read(buffer, 0, buffer.length)) != -1)
      {
        sBuffer.append(buffer, 0, c);
      }
      reader.close();
}
}
