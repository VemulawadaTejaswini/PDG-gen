//75
public class func{
	public void run(){
        String rawAlarmId = AgencyAndIdLibrary.convertToString(alarmId);
        rawUrl = rawUrl.replace("#ALARM_ID#", rawAlarmId);
        URL url = new URL(rawUrl);
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        in.close();
}
}
