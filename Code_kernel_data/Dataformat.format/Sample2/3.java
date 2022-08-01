//2
public class func{
	public void formatDateW3C(Date date){
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
      String text = df.format(date);
      return text.substring(0, 22) + ":" + text.substring(22);
}
}
