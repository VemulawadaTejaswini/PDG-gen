public class func{
public void MonitorServiceImpl(){
    (new Thread(new AlarmManager(conf, this))).start();
}
}
