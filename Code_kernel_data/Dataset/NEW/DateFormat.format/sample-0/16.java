//16
public class func{
public void checkDateFormatSanity(DateFormat dateFormat,long date){
      return date == dateFormat.parse(dateFormat.format(new Date(date)))
        .getTime();
}
}
