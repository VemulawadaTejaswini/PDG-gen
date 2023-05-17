public class func{
public void findApplets(URL u){
      inrdr = new BufferedReader(new InputStreamReader(u.openStream()));
      while ((i = inrdr.read()) != -1) {
        thisChar = (char)i;
        if (thisChar == '<') {
          String tag = readTag(inrdr);
          if (tag.toUpperCase().startsWith("<APPLET"))
            list.add(tag);
        }
      }
      inrdr.close();
}
}
