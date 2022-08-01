//14
public class func{
	public void widgetSelected(SelectionEvent e){
                    tmpcal.add(
                        Calendar.YEAR,
                        ((Integer) item.getData("Year")).intValue() - 5); //$NON-NLS-1$
                    setCDTSelection(tmpcal.getTime());
}
}
