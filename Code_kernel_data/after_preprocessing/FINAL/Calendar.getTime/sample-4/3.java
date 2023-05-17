public class func{
public void areEqual(Calendar one,Calendar another){
    if ( one == another ) {
      return true;
    }
    if ( one == null || another == null ) {
      return false;
    }
    return one.getTimeZone().getRawOffset() == another.getTimeZone().getRawOffset() && one.getTime() == another.getTime();
}
}
