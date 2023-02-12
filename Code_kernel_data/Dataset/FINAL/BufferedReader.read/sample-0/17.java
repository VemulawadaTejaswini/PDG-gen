public class func{
public void read(InputStream is){
      BufferedReader inFile = new BufferedReader(new InputStreamReader(is));
      while ((len = inFile.read(buff)) >= 0)
        strb.append(buff, 0, len);
      inFile.close();
}
}
