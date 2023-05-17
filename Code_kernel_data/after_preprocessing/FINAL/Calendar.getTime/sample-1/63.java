public class func{
public void createHourlyRawFile(File outputFile,Calendar calendar){
        store.setTime(calendar.getTime());
        store.store(outputFile);
}
}
