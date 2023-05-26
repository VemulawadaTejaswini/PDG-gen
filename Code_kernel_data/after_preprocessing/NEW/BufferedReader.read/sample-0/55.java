//55
public class func{
public void readURLConnection(URLConnection uc){
      reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
      while ((letter = reader.read()) != -1)
        buffer.append((char) letter);
}
}
