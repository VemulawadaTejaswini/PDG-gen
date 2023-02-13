public class func{
public void updateYears(){
        yearButtons[i].setText(getFormattedDate(
            "yyyy", tmpcal.getTime()));
        tmpcal.add(Calendar.YEAR, 1);
}
}
