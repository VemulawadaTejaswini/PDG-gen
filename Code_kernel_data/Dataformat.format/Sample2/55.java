//54
public class func{
	public void timestamp(Date timestamp){
      final DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
      return parameter("timestamp", format.format(timestamp));
}
}
