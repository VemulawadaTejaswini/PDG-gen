public class func{
public void formatTime(Calendar calend){
    if (calend == null) {
      return null;
    }
    return TIME_FORMATTER.format(calend.getTime());
}
}
