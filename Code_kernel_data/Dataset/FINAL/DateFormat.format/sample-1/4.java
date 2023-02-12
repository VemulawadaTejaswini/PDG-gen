public class func{
public void updateTimeAndDateDisplay(Context context){
        mTimePref.setSummary(DateFormat.getTimeFormat(getActivity()).format(now.getTime()));
        mTimeZone.setSummary(getTimeZoneText(now.getTimeZone(), true));
        mDatePref.setSummary(shortDateFormat.format(now.getTime()));
        mDateFormat.setSummary(shortDateFormat.format(dummyDate));
}
}
