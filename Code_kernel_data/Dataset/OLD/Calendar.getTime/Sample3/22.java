//21
public class func{
	public void checkUbTime(){
    Calendar realTime = getRealTime();
    realTime.add(Calendar.MINUTE, BEFORE_MINUTE);
    int nowTime = Integer.valueOf(sdf.format(realTime.getTime()));
    return _ubTimes.contains(nowTime);
}
}
