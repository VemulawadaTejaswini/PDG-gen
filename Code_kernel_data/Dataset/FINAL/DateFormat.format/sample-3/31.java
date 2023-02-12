public class func{
public void updateTimeAndDateDisplay(Context context){
            mTimeTextView.setText(DateFormat.getTimeFormat(getActivity()).format(now.getTime()));
            mDateTextView.setText(shortDateFormat.format(now.getTime()));
}
}
