public class func{
public void setWorkerId(final String workerId){
    cal.add(Calendar.MINUTE, Integer.parseInt(ImportTaskProperties.IMPORT_TASK_TIMEOUT_MINUTES));
    this.workerTimeOut = cal.getTime();
}
}
