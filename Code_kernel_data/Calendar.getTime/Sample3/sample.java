//0
public class func{
	public void getExecutionDate(long repeatIntervalInSeconds){
    calendar.add(Calendar.SECOND, (int) repeatIntervalInSeconds);
    return calendar.getTime();
}
}
//1
public class func{
	public void computeExpiry(){
    if (approvalExpirySeconds == -1) { // use default of 1 month
      expiresAt.add(Calendar.MONTH, 1);
    }
    else {
      expiresAt.add(Calendar.SECOND, approvalExpirySeconds);
    }
    return expiresAt.getTime();
}
}
//2
public class func{
	public void computeExpiry(){
        if (approvalExpiryInMillis == -1) { // use default of 1 month
            expiresAt.add(Calendar.MONTH, 1);
        }
        else {
            expiresAt.add(Calendar.MILLISECOND, approvalExpiryInMillis);
        }
        return expiresAt.getTime();
}
}
//3
public class func{
	public void handleEvent(Event event){
              tmpcal.add(Calendar.YEAR, 10);
              tmpcal.add(Calendar.MONTH, 1);
            setCDTSelection(tmpcal.getTime());
}
}
//4
public class func{
	public void getNextCheckinTime(){
      nextCheckinTime.add(Calendar.SECOND, (int) getCheckinInterval());
      return nextCheckinTime.getTime();
}
}
//5
public class func{
	public void dateToGDateTime(Date date){
    Calendar cal = new GregorianCalendar();
    cal.setTime(date);
    cal.add(Calendar.MILLISECOND,
        cal.getTimeZone().getOffset(cal.getTimeInMillis()));
    return new DateTime(cal.getTime());
}
}
//6
public class func{
	public void updateStartTime(){
    now.add(Calendar.SECOND, (int)intervalSec);
    this.startTime = now.getTime();
}
}
//7
public class func{
	public void getArrivalTime(Date departureTime,int mileage){
    c.add(Calendar.HOUR, (int)hours);
    c.add(Calendar.MINUTE, minutes);
    return c.getTime();
}
}
//8
public class func{
	public void add(Date d){
    cal.add( Calendar.SECOND, (int) getValueInSeconds());
    return cal.getTime();
}
}
//9
public class func{
	public void getMinDate(){
      Calendar calendar = new GregorianCalendar();
      calendar.add(Calendar.MONTH, -2);
      minDate = calendar.getTime();
}
}
//10
public class func{
	public void getMaxDate(){
      Calendar calendar = new GregorianCalendar();
      calendar.add(Calendar.MONTH, 2);
      maxDate = calendar.getTime();
}
}
//11
public class func{
	public void decodeBirthDate(String ws){
    Calendar c = new GregorianCalendar (2013, Calendar.JANUARY, 1);
    c.add (Calendar.DAY_OF_YEAR, weeks * 7);
    return c.getTime ();
}
}
//12
public class func{
	public void twentyYearsTime(){
        Calendar earliestExpiry = new GregorianCalendar();
        earliestExpiry.add(Calendar.SECOND, 631138519);
        return earliestExpiry.getTime();
}
}
//13
public class func{
	public void gDateTimeToDate(DateTime dateTime){
      cal.add(Calendar.MILLISECOND,
          -cal.getTimeZone().getOffset(cal.getTimeInMillis()));
    return cal.getTime();
}
}
//14
public class func{
	public void widgetSelected(SelectionEvent e){
                    tmpcal.add(
                        Calendar.YEAR,
                        ((Integer) item.getData("Year")).intValue() - 5); //$NON-NLS-1$
                    setCDTSelection(tmpcal.getTime());
}
}
//15
public class func{
	public void handleEvent(Event event){
                  tmpcal.add(Calendar.YEAR,
                      (event.count > 0) ? 1 : -1);
                  setCDTSelection(tmpcal.getTime());
}
}
//16
public class func{
	public void getDueDate(Media media){
    c.add(Calendar.DAY_OF_YEAR, media.howManyDaysThisCanBeBorrowed());
    return c.getTime();
}
}
//17
public class func{
	public void getDueDate(Media media){
    c.add(Calendar.DAY_OF_YEAR, media.howManyDaysThisCanBeBorrowed());
    return c.getTime();
}
}
//18
public class func{
	public void getRecentChangesCount(long groupId,long nodeId){
    Calendar cal = CalendarFactoryUtil.getCalendar();
    cal.add(Calendar.WEEK_OF_YEAR, -1);
    return wikiPageFinder.countByCreateDate(
      groupId, nodeId, cal.getTime(), false);
}
}
//19
public class func{
	public void getHTTPTime(int days){
            calendar.add(Calendar.DAY_OF_MONTH, days);
            return dateFormat.format(calendar.getTime());
}
}
//20
public class func{
	public void run(){
                    Calendar c = (Calendar) (startTimestamp.clone());
                    c.add(Calendar.MINUTE, i);
                    cappedTestCollection.insert(BasicDBObjectBuilder.start("increasing", c.getTime()).add("string", "value" + i).get(), WriteConcern.SAFE);
}
}
//21
public class func{
	public void checkUbTime(){
    Calendar realTime = getRealTime();
    realTime.add(Calendar.MINUTE, BEFORE_MINUTE);
    int nowTime = Integer.valueOf(sdf.format(realTime.getTime()));
    return _ubTimes.contains(nowTime);
}
}
//22
public class func{
	public void getRecentChanges(long groupId,long nodeId,int start,int end){
    Calendar cal = CalendarFactoryUtil.getCalendar();
    cal.add(Calendar.WEEK_OF_YEAR, -1);
    return wikiPageFinder.findByCreateDate(
      groupId, nodeId, cal.getTime(), false, start, end);
}
}
//23
public class func{
	public void title(final int cell){
        final Calendar d = (Calendar) date.clone();
        d.add(Calendar.MONTH, cell);
        final String displayName = monthFormat.format(d.getTime()) + " " + d.get(Calendar.YEAR);
}
}
//24
public class func{
	public void getNextWorkingDay(Date day){
        Calendar calendarDay = DateUtils.getCalendar(day);
        do {
            calendarDay.add(Calendar.DATE, 1);
        } while (!isWorkingDay(calendarDay));
        return calendarDay.getTime();
}
}
//25
public class func{
	public void getLiferayDate(Date jiraDate){
    cal.add(Calendar.MILLISECOND, _getUTCOffset() * -1);
    return cal.getTime();
}
}
//26
public class func{
	public void getReadingDateHeader(final int dayNumber){
    Calendar calendar = GregorianCalendar.getInstance();
    calendar.setTimeInMillis(readingPlan.info.startTime);
    calendar.add(Calendar.DATE, dayNumber);
    return getString(R.string.rp_dayHeader, (dayNumber + 1), Sqlitil.toLocaleDateMedium(calendar.getTime()));
}
}
//27
public class func{
	public void generateOccurrencesFrom(Date date,List<EventDetail> events){
    endDate.add(java.util.Calendar.YEAR, 100);
    return generateOccurrencesInRange(date, new Date(endDate.getTime()), events);
}
}
//28
public class func{
	public void doJob(){
    cal.add(Calendar.MINUTE, RandomUtils.nextInt(10000));
    t.postedAt = cal.getTime(); 
}
}
//29
public class func{
	public void dateRangeChanged(ScheduleDateRangeChangeEvent event){
            calendar.add(Calendar.DATE, 15);
        setInitialDate(calendar.getTime());
}
}
//30
public class func{
	public void calculateNextTime(Date time){
    calendar.add(periodUnit.calendarField, period);
    return calendar.getTime();
}
}
//31
public class func{
	public void getJIRADate(Date liferayDate){
    cal.add(Calendar.MILLISECOND, _getUTCOffset());
    return cal.getTime();
}
}
//32
public class func{
	public void getJIRADate(int weeksFromNow){
    cal.add(Calendar.MILLISECOND, _getUTCOffset());
    return cal.getTime();
}
}
//33
public class func{
	public void getMaxAge(Group group){
    int maxAge = TrashUtil.getMaxAge(group);
    calendar.add(Calendar.MINUTE, -maxAge);
    return calendar.getTime();
}
}
//34
public class func{
	public void setWorkerId(final String workerId){
    cal.add(Calendar.MINUTE, Integer.parseInt(ImportTaskProperties.IMPORT_TASK_TIMEOUT_MINUTES)); // adds one hour
    this.workerTimeOut = cal.getTime(); //
}
}
//35
public class func{
	public void add(Date date,int iMultiple){
    dateTime.add( getUnit().getCalendarConst(), getStep() * iMultiple );
    return dateTime.getTime();
}
}
//36
public class func{
	public void createUTCDate(final int year,final int dayOfYear,final int millisInDay){
        final Calendar calendar = ProductData.UTC.createCalendar();
        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
        calendar.add(Calendar.MILLISECOND, millisInDay);
        return ProductData.UTC.create(calendar.getTime(), 0);
}
}
//37
public class func{
	public void queryMore(final AbstractTsiProvider provider,final boolean later){
      c.add(Calendar.MINUTE, later ? 1 : -1);
      return provider.queryTripsFromContext(this, c.getTime(), later);
}
}
//38
public class func{
	public void setupDateStrings(){
      dateStrings[idx] = format.format(cal.getTime());
      cal.add(1, Calendar.DAY_OF_YEAR);
}
}
//39
public class func{
	public void createTestBeanItemContainer(){
            eventContainer.addBean(new BasicEvent("Test " + i, "Description "
                    + i, cal.getTime()));
            cal.add(java.util.Calendar.DAY_OF_MONTH, 2);
}
}
//40
public class func{
	public void updateYears(){
        yearButtons[i].setText(getFormattedDate(
            "yyyy", tmpcal.getTime())); //$NON-NLS-1$
        tmpcal.add(Calendar.YEAR, 1);
}
}
