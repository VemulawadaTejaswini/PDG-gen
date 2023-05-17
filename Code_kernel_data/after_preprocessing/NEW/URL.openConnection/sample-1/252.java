//252
public class func{
public void construct(){
                    URL url = new URL(getDocumentBase(), getParameter("datafile"));
                    InputStream in = url.openConnection().getInputStream();
}
}
