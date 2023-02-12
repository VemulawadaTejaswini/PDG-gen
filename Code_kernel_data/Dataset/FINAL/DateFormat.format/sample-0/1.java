public class func{
public void secToDateTime(long time){
    String dateString = f.format(new Date(time * 1000));
    if(dateString.endsWith("-00:00:00"))
      dateString = dateString.substring(0, 8);
}
}
