public class func{
public void handleEvent(Event event){
                  tmpcal.add(Calendar.YEAR,
                      (event.count > 0) ? 1 : -1);
                  setCDTSelection(tmpcal.getTime());
}
}
