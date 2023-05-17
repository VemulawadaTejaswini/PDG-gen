//6
public class func{
public void getReferenceFromURL(URL url){
      URLConnection uc = url.openConnection();
      is = uc.getInputStream();
      BufferedReader in = new BufferedReader(new InputStreamReader(is, MediaType.getCharsetRobustOrUTF(uc.getContentType())));
      while ((line = in.readLine()) != null) {
        ref.append( line ).append('\n');
      }
      Closer.close(is);
}
}
