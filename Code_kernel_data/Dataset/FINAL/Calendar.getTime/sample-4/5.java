public class func{
public void getDatePropertyValue(String propertyName){
        Calendar cal = (Calendar) doc.getPropertyValue(propertyName);
        if (cal != null) {
            return cal.getTime();
        }
}
}
