public class func{
public void getValue(DocumentModel doc){
                Calendar cal = (Calendar) doc.getPropertyValue("dc:created");
                if (cal != null) {
                    return cal.getTime();
                }
}
}
