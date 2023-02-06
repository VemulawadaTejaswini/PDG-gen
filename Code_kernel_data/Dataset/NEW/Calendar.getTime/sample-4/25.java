//25
public class func{
public void dateChanged(Calendar date){
        if (date == null) {
          System.err.println("Date changed to null");
        }
        else {
          System.err.println("Date changed " + date.getTime());
        }
}
}
