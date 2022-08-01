//59
public class func{
	public void isNoOverlap(final Calendar dat1,final Calendar dat2){
            return DateHelper.minutesBetween(dat1.getTime(), dat2.getTime(), false, false) >= 0;
}
}
