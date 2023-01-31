//168
public class func{
	public void handleEvent(Event event){
          tmpcal.set(Calendar.AM_PM, (tmpcal.get(Calendar.AM_PM) == 0) ? 1 : 0);
          setSelection(tmpcal.getTime());
          cdt.fireSelectionChanged(Calendar.AM_PM);
}
}
