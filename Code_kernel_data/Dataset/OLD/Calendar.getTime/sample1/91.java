//90
public class func{
	public void doAsyncHarvest(HarvestingDataverse dataverse){
        timerService.createTimer(cal.getTime(), new HarvestTimerInfo(dataverse.getId(), dataverse.getVdc().getName(), dataverse.getSchedulePeriod(), dataverse.getScheduleHourOfDay(), dataverse.getScheduleDayOfWeek()));
}
}
