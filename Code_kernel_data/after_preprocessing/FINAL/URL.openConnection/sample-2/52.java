public class func{
public void write(URL url,FontPackDocument doc){
    OutputStreamWriter wr = new OutputStreamWriter(url.openConnection().getOutputStream());
    json.toJson(doc, FontPackDocument.class, wr);
    wr.close();
}
}
