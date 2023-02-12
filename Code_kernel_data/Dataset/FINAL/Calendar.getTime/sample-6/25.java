public class func{
public void DummyDataProvider(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -1);
        if (lastDataUpdate == null || lastDataUpdate.before(cal.getTime())) {
            refreshStaticData();
            lastDataUpdate = new Date();
        }
}
}
