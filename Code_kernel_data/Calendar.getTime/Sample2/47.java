//46
public class func{
	public void extendTime(TimePeriod timePeriod){
        cal.setTime( timePeriod.getEnd() );
        cal.add( Calendar.MILLISECOND, samplingPeriodMS * numOfMeasurements );
        timePeriod.extend( cal.getTime() );
}
}
