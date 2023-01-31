//278
public class func{
	public void updateWidget(final Context context,final int widgetId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                updateWidget(context, AppWidgetManager.getInstance(context), widgetId, BatteryLevel.getCurrent());
            }
        }).start();
}
}
