//22
public class func{
public void getModifiedDate(){
    Calendar calendar = _cmisFolder.getLastModificationDate();
    if (calendar != null) {
      return calendar.getTime();
    }
    else {
      return new Date();
    }
}
}
