//37
public class func{
public void extractOutput(InputStream stream,XHTMLContentHandler xhtml){
      reader = new BufferedReader(new InputStreamReader(stream, IOUtils.UTF_8));
      while ((n = reader.read(buffer)) != -1) {
        if (n > 0) {
          xhtml.characters(buffer, 0, n);
        }
        totalBytes += n;
      }
      reader.close();
}
}
