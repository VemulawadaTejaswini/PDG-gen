//185
public class func{
	public void scheduleCalendarAlarms(final Context context,boolean force){
        new Thread(new Runnable() {
            @Override
            public void run() {
                CalendarAlarmScheduler.scheduleAllCalendarAlarms(context);
            }
        }).start();
}
}
