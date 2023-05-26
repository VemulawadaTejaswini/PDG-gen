public class func{
public void widgetSelected(SelectionEvent e){
                    tmpcal.set(
                        Calendar.MONTH,
                        ((Integer) item
                            .getData("Month")).intValue());
                    setCDTSelection(tmpcal.getTime());
}
}
