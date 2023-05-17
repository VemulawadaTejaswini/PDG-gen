public class func{
public void getTotalSize(){
      for ( Object object : sources.values()) {
        if ( object instanceof File) total += (( File) object).length();
        else if ( object instanceof URL) total += (( URL) object).openConnection().getContentLength();
      }
}
}
