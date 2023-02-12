public class func{
public void toString(){
        DateFormat format = new SimpleDateFormat(DATE_FORMAT);
        return manifest.getTitle() + "\n" + format.format(timestamp);
}
}
