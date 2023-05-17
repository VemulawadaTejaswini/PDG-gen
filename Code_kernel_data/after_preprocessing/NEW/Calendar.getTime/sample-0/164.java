//164
public class func{
public void widgetSelected(SelectionEvent e){
                    tmpcal.set(
                        Calendar.MONTH,
                        ((Integer) item
                            .getData("Month")).intValue()); //$NON-NLS-1$
                    setCDTSelection(tmpcal.getTime());
}
}
