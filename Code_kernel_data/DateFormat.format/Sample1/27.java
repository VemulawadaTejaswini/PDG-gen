//26
public class func{
	public void process(Object value){
  if (value == null) {
      return "";
  }
  if(value instanceof Timestamp)
      return dateFormat.format((Timestamp) value);
  else 
      return dateFormat.format((Date) value);
}
}
