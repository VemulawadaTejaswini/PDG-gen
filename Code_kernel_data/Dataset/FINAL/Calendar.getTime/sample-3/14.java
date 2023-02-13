public class func{
public void widgetSelected(SelectionEvent e){
                    tmpcal.add(
                        Calendar.YEAR,
                        ((Integer) item.getData("Year")).intValue() - 5);
                    setCDTSelection(tmpcal.getTime());
}
}
