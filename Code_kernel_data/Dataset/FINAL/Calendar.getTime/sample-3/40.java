public class func{
public void updateYears(){
        yearButtons[i].setText(getFormattedDate(
            "yyyy", tmpcal.getTime())); //$NON-NLS-1$
        tmpcal.add(Calendar.YEAR, 1);
}
}
