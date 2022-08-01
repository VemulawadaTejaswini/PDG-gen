//24
public class func{
	public void testConstructorWithStringArgument(){
    DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");
    String date = dateFormat.format(expected);
    this.xmlRpcDateTime = new XmlRpcDateTime(date);
    assertEquals("<Value>", expected, this.xmlRpcDateTime.getValue());
}
}
