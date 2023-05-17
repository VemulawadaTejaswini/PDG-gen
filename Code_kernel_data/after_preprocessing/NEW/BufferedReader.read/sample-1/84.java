//84
public class func{
public void writeInputStreamToFile(String fileName,BufferedReader bufferedReader){
      while ((len = bufferedReader.read(buf)) > 0)
        out.write(buf, 0, len);
      out.close();
}
}
