//275
public class func{
public void init(){
            URLConnection urlConnection = new URL(nextPageUrl).openConnection();
            nextPageUrl = extractRelativeLink(urlConnection.getHeaderField("Link"), "next");
}
}
