//156
public class func{
	public void TestBC(){
        Locale zhTWloc = new Locale("zh", "TW");
        SimpleDateFormat sdf = new SimpleDateFormat("G", zhTWloc);
        Calendar cdar = sdf.getCalendar();
        cdar.set(-2000, 1, 1);
        return Test(sdf.format(cdar.getTime()), "\u897f\u5143\u524d", "BC");
}
}
