//9
public class func{
public void _now(String args[]){
      if ("long".equals(args[1]))
        return now.getTime();
      DateFormat df = new SimpleDateFormat(args[1]);
      return df.format(now);
    return new Date();
}
}
