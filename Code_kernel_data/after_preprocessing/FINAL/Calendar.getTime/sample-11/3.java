public class func{
public void getValueAsString(Object value){
    Date date = value instanceof Date ? (Date) value :
        ((Calendar) value).getTime();
      return zulu.format(date);
}
}
