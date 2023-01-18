//0
public class func{
	public void atDateAtTime(long now,Calendar startDate){
    c.set(Calendar.HOUR_OF_DAY, startDate.get(Calendar.HOUR_OF_DAY));
    c.set(Calendar.MINUTE, startDate.get(Calendar.MINUTE));
    c.set(Calendar.SECOND, startDate.get(Calendar.SECOND));
    c.set(Calendar.MILLISECOND, startDate.get(Calendar.MILLISECOND));
    return c.getTime();
}
}
//1
public class func{
	public void getEndOfHour(Date day,Calendar cal){
        if (day == null || cal == null) {
            return day;
        }
        cal.setTime(day);
        cal.set(Calendar.MINUTE,      cal.getMaximum(Calendar.MINUTE));
        cal.set(Calendar.SECOND,      cal.getMaximum(Calendar.SECOND));
        cal.set(Calendar.MILLISECOND, cal.getMaximum(Calendar.MILLISECOND));
        return cal.getTime();
}
}
//2
public class func{
	public void unifyDateTime(Date date,Date time){
    Calendar timeCalender = getCalendar();
    timeCalender.setTime(time);
    calendar.set(Calendar.HOUR_OF_DAY, timeCalender.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.MINUTE, timeCalender.get(Calendar.MINUTE));
    calendar.set(Calendar.SECOND, timeCalender.get(Calendar.SECOND));
    return calendar.getTime();
}
}
//3
public class func{
	public void getEndOfDay(Date day,Calendar cal){
        if (day == null) {
            day = new Date();
        }
        cal.setTime(day);
        cal.set(Calendar.HOUR_OF_DAY, cal.getMaximum(Calendar.HOUR_OF_DAY));
        cal.set(Calendar.MINUTE,      cal.getMaximum(Calendar.MINUTE));
        cal.set(Calendar.SECOND,      cal.getMaximum(Calendar.SECOND));
        cal.set(Calendar.MILLISECOND, cal.getMaximum(Calendar.MILLISECOND));
        return cal.getTime();
}
}
//4
public class func{
	public void raidDate(Bombed bombed){
    instance.set(Calendar.YEAR, bombed.year());
    instance.set(Calendar.MONTH, bombed.month());
    instance.set(Calendar.DAY_OF_MONTH, bombed.day());
    instance.set(Calendar.HOUR_OF_DAY, bombed.time());
    instance.set(Calendar.MINUTE, 0);
    return instance.getTime();
}
}
//5
public class func{
	public void getBirthDate(Random r){
        c.set(Calendar.YEAR, r.nextInt(100) + 1900);
        c.set(Calendar.MONTH, r.nextInt(12));
        c.set(Calendar.DAY_OF_MONTH, r.nextInt(31));
        return c.getTime();
}
}
//6
public class func{
	public void buildDate(int month,int year){
        c.set(Calendar.DAY_OF_MONTH, random.nextInt(28)); // No sales on 29, 30 and 31 ;-)
        c.set(Calendar.MONTH, month - 1); // Some genius thought that the first month is 0
        c.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        c.set(Calendar.MINUTE, random.nextInt(60));
        return c.getTime();
}
}
//7
public class func{
	public void getNextLaunchDate(){
    Calendar calendar = Calendar.getInstance(Locale.US);
    calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR));
    calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.SECOND, 0);
    return new Date(calendar.getTime().getTime() + MILLISEC_IN_HOUR);
}
}
//8
public class func{
	public void getEndOfMinute(Date day,Calendar cal){
        if (day == null || cal == null) {
            return day;
        }
        cal.setTime(day);
        cal.set(Calendar.SECOND,      cal.getMaximum(Calendar.SECOND));
        cal.set(Calendar.MILLISECOND, cal.getMaximum(Calendar.MILLISECOND));
        return cal.getTime();
}
}
//9
public class func{
	public void asDate(){
    if (timeZone != null) {
      c = Calendar.getInstance(timeZone);
    } else {
      c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }
    c.set(Calendar.MILLISECOND, 0);
    return c.getTime();
}
}
//10
public class func{
	public void getEnd(){
      Calendar cal = this.createCalendar();
      cal.add(Calendar.YEAR,-1);
      cal.set(Calendar.MONTH,Calendar.DECEMBER);
      cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
      return DateUtil.endOfDay(cal.getTime());
}
}
//11
public class func{
	public void now(){
    cal.set(Calendar.HOUR_OF_DAY, nowCalendar.get(Calendar.HOUR_OF_DAY));
    cal.set(Calendar.MINUTE, nowCalendar.get(Calendar.MINUTE));
    NSTimestamp now = new NSTimestamp(cal.getTime());
}
}
//12
public class func{
	public void getDate(Date date,String hour){
    calendar.set(HOUR_OF_DAY, extractHour(hour));
    calendar.set(MINUTE, extractMinutes(hour));
    return calendar.getTime();
}
}
//13
public class func{
	public void testInitial(){
        TimeZone utcZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(utcZone);
        calendar.set(Calendar.MILLISECOND, 0);
        long baseTime = calendar.getTime().getTime() / 1000L;
        assertEquals(baseTime, -TimeTCPClient.SECONDS_1900_TO_1970);
}
}
//14
public class func{
	public void setup(){
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1994, 10, 6, 8, 49, 37);
        schedTimeUtc = calendar.getTime();
}
}
//15
public class func{
	public void shouldCovertToIsoString(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(1970, 0, 1, 0, 0, 0);
        the(Convert.toIsoString(cal.getTime())).shouldBeEqual("1970-01-01T00:00:00Z");
}
}
//16
public class func{
	public void setup(){
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar2.set(2011, 9, 14, 12, 34, 56);
        lockedUntilUtc = calendar2.getTime();
}
}
//17
public class func{
	public void makeDate(int year,int month,int date,int hour,int minute,int second,String timeZoneName){
      Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZoneName));
      cal.set(Calendar.MILLISECOND, 0);
      return cal.getTime();
}
}
//18
public class func{
	public void aTimeInTheEvening(){
    Calendar time = Calendar.getInstance( TimeZone.getTimeZone( "Europe/Berlin" ) );
    time.set( Calendar.MILLISECOND, 311 );
    return time.getTime();
}
}
//19
public class func{
	public void christmasDay(){
    Calendar christmas = Calendar.getInstance( TimeZone.getTimeZone( "Europe/Berlin" ) );
    christmas.set( Calendar.MILLISECOND, 0 );
    return christmas.getTime();
}
}
//20
public class func{
	public void testFriendlyFormatWithTime_ReturnsTodayAndTime_WhenDateIsToday(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(DateUtils.APPLICATION_TIME_ZONE));
        cal.set(Calendar.MINUTE, 30);
        assertEquals("Today at 14:30", df.formatAsDateWithTime(cal.getTime()));
}
}
//21
public class func{
	public void assertEqualTimes(){
        Calendar cal = Calendar.getInstance();
        cal.set(2010, Calendar.JANUARY, 1, 12, 0, 0);
        Date actual = new Date(cal.getTime().getTime() + 50); // 50ms deviation
        DroidFuAssertions.assertTimeEquals(expected, actual);
}
}
//22
public class func{
	public void updateTitle(int year,int month,int day){
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
                year == NO_YEAR ? mTitleNoYearDateFormat : mTitleDateFormat;
        setTitle(dateFormat.format(calendar.getTime()));
}
}
//23
public class func{
	public void getDefault(){
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DATE,31);
    return DateUtil.endOfDay(cal.getTime());
}
}
//24
public class func{
	public void setStartDateIfNull(java.util.Date start){
            Calendar calendar = Calendar.getInstance();
            calendar.set(2013, Calendar.FEBRUARY, 1);
            result = calendar.getTime();
}
}
//25
public class func{
	public void sampleDate(){
    Calendar calendar = Calendar.getInstance(Locale.GERMAN);
    calendar.set(Calendar.MILLISECOND, 168);
    return calendar.getTime();
}
}
//26
public class func{
	public void testParse(){
    Calendar c1 = Calendar.getInstance();
    c1.set(Calendar.MILLISECOND, 0);
    Date date = c1.getTime();
}
}
//27
public class func{
	public void addDateDoc(String content,int year,int month,int day,int hour,int minute,int second,IndexWriter iw){
    Calendar cal = Calendar.getInstance(Locale.ROOT);
    cal.set(year, month - 1, day, hour, minute, second);
    d.add(new Field("date", getDate(cal.getTime(), DateTools.Resolution.DAY),
        StringField.TYPE_NOT_STORED));
    iw.addDocument(d);
}
}
//28
public class func{
	public void getMinDate(){
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, 1000);
    return cal.getTime();
}
}
//29
public class func{
	public void getDate(int year,int month,int day){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
}
}
//30
public class func{
	public void toDate(int year,int month,int day,int hour,int minute,int second){
    Calendar calend = Calendar.getInstance();
    calend.set(Calendar.MILLISECOND, 0);
    return calend.getTime();
}
}
//31
public class func{
	public void formatAsHashInDateFormat(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DATE, 16);
    shouldCompileTo("{{dateFormat date format=\"dd-MM-yyyy\"}}", $("date", calendar.getTime()),
        "16-07-1999");
}
}
//32
public class func{
	public void date(final int day,final int month,final int year){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    return calendar.getTime();
}
}
//33
public class func{
	public void getDateDos(int time){
  Calendar cal = Calendar.getInstance();
  cal.set(Calendar.SECOND, (time & 0x1f) * 2);
  return cal.getTime();
}
}
//34
public class func{
	public void onDateSet(DatePicker view,int year,int monthOfYear,int dayOfMonth){
                        Calendar c = Calendar.getInstance(Locale.getDefault());
                        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                                .format(c.getTime()));
}
}
//35
public class func{
	public void getInitialDate(){
            Calendar instance = Calendar.getInstance();
            instance.set(Calendar.DATE, 22);
            initialDate = instance.getTime();
}
}
//36
public class func{
	public void getNotBefore(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.JANUARY, 1);
        return calendar.getTime();
}
}
//37
public class func{
	public void getNotAfter(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2099, Calendar.DECEMBER, 31);
        return calendar.getTime();
}
}
//38
public class func{
	public void getDate(int year,int month,int day){
        Calendar cal = Calendar.getInstance();
        cal.set( Calendar.MILLISECOND, 0 );
        return cal.getTime();
}
}
//39
public class func{
	public void getMaxDate(){
        Calendar cal = Calendar.getInstance();
        cal.set(2036, 12, 28, 23, 59, 59);
        return cal.getTime();
}
}
//40
public class func{
	public void getMinDate(){
        Calendar cal = Calendar.getInstance();
        cal.set(1970, 1, 1, 1, 1, 1);
        return cal.getTime();
}
}
//41
public class func{
	public void setDateTime(int year,int month,int day,int hour,int min,int sec){
        Calendar cal = Calendar.getInstance(); // Use default timezone
        cal.set(Calendar.MILLISECOND, 0);
        req.setDateTime(cal.getTime());
}
}
//42
public class func{
	public void onDateSet(DatePicker view,int year,int monthOfYear,int dayOfMonth){
            Calendar selected = Calendar.getInstance();
            selected.set(year, monthOfYear, dayOfMonth);
            text.setText(TypeConverter.getDateString(selected.getTime()));
}
}
//43
public class func{
	public void testProducerWithDateHeader(){
        Calendar cal = Calendar.getInstance();
        cal.set(1974, Calendar.APRIL, 20);
        Date date = cal.getTime();
        template.sendBodyAndHeader("file://target/filelanguage?fileName=mybirthday-${date:in.header.birthday:yyyyMMdd}.txt",
            "Hello World", "birthday", date);
}
}
//44
public class func{
	public void getExpired(){
        Calendar today = Calendar.getInstance();
        today.set(Calendar.SECOND, 59);
        return (endDate != null) && (endDate.compareTo(today.getTime()) > 0);
}
}
//45
public class func{
	public void getDate(){
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.SECOND, 10);
    return cal.getTime();
}
}
//46
public class func{
	public void getDefaultDate(){
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.SECOND, 0);
    return cal.getTime();
}
}
//47
public class func{
	public void testFormat(){
    Calendar cal = Calendar.getInstance();
    cal.set(2011, 9, 1, 14, 30, 24);
    Date toFormat = cal.getTime();
    assertEquals("2011-10-01 14:30:24", format.format(toFormat));
}
}
//48
public class func{
	public void createDate(int year,int month,int day){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
//49
public class func{
	public void getTimezone(int year,int month,int day){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DAY_OF_MONTH, day);
    Date date = calendar.getTime();
}
}
//50
public class func{
	public void testProducerWithDateHeader(){
        Calendar cal = Calendar.getInstance();
        cal.set(1974, Calendar.APRIL, 20);
        Date date = cal.getTime();
}
}
//51
public class func{
	public void getDate(int year,int month,int day){
    Calendar date = Calendar.getInstance();
    date.set(Calendar.DAY_OF_MONTH, day);
    return date.getTime();
}
}
//52
public class func{
	public void getDefaultDate(){
    Calendar c1 = Calendar.getInstance(); 
    c1.set(1900, 00 , 01, 0, 0, 0);
    return c1.getTime();
}
}
//53
public class func{
	public void TimestampSetter(){
    calendar = Calendar.getInstance();
    calendar.set(Calendar.MILLISECOND, 0);
    timestamp = new SimpleTimestampContainer(calendar.getTime());
}
}
//54
public class func{
	public void getDate(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
//55
public class func{
	public void getPageForSitemap(Date lastModifiedDate){
    if(lastModifiedDate == null){
      java.util.Calendar cal = Calendar.getInstance();
      cal.set(1970, 0, 1);
      lastModifiedDate = cal.getTime();
    }
    return pageDAO.getPageForSitemap(lastModifiedDate, 0, 0);
}
}
//56
public class func{
	public void testToDateWithGYearMonth(){
        Calendar controlCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        controlCalendar.clear();
        controlCalendar.set(Calendar.MONTH, Calendar.MAY);
        Date controlDate = controlCalendar.getTime();
}
}
//57
public class func{
	public void createDate(int year,int month,int day,int hour,int minute){
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("JST"), Locale.JAPANESE);
        calendar.clear();
        calendar.set(Calendar.MINUTE, minute);
        return new DateTime(calendar.getTime().getTime());
}
}
//58
public class func{
	public void testTimeScaleUnit(){
      final TimeZone tz = TimeZone.getTimeZone("UTC");
      final Calendar calendar = Calendar.getInstance(tz);
      calendar.clear();
      calendar.set(1970, 0, 1);
    TimeScaleUnit tunit = new TimeScaleUnit(TimeScaleUnit.SECOND, calendar.getTime());
}
}
//59
public class func{
	public void testConversion(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(2009, 6, 3, 12, 20, 10);
    DateContainer result = mapper.map(calendar.getTime(), DateContainer.class);
    assertNotNull(result);
    assertEquals("2009-07-03 12:20:10", result.getDate());
    assertEquals("2009-07-03 12:20:10", result.getSet().iterator().next());
}
}
//60
public class func{
	public void getDataHoje(){
    Calendar dataHoje = Calendar.getInstance();
    dataHoje.set(Calendar.MILLISECOND, 0);
    return dataHoje.getTime();
}
}
//61
public class func{
	public void datesWithProvidedLocale(){
        Calendar cal = Calendar.getInstance();
        cal.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("Today is 1. tammikuuta 1970", testMessages.today(cal.getTime()));
}
}
//62
public class func{
	public void dates(){
        Calendar cal = Calendar.getInstance();
        cal.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("Today is January 1, 1970", getMessages().today(cal.getTime()));
}
}
//63
public class func{
	public void date(int year,int month){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
}
}
//64
public class func{
	public void dateParams(){
        Calendar cal = Calendar.getInstance();
        cal.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        String str = getMessages().today(cal.getTime());
        assertEquals("{net.lightoze.gwt.i18n.client.TestMessages#today?t=" + cal.getTimeInMillis() + "}", str);
}
}
//65
public class func{
	public void getCells(int month,int year){
    Calendar cal = Calendar.getInstance(locale);
    cal.set(MONTH, month);
    return view.getMonthCells(new MonthDescriptor(month, year, cal.getTime(), "January 2012"), cal);
}
}
//66
public class func{
	public void TimeDateTester(String nameOfTest,int year,int month,int date,int hrs,int min,int sec,int nano){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MILLISECOND, nano / 1000000);
        utilDate = c.getTime();
}
}
//67
public class func{
	public void nextDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, date);
        return calendar.getTime();
}
}
//68
public class func{
	public void getSQLDate(){
    final Calendar cal = Calendar.getInstance(DateHelper.EUROPE_BERLIN);
}
}
//69
public class func{
	public void timeServiceIsUsedForPastOnDate(){
    Calendar date = Calendar.getInstance();
    date.set( 1901, 1, 15, 4, 0, 0 );
    order.orderDateAsDate = date.getTime();
}
}
//70
public class func{
	public void expirationTime(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, -EXPIRATION_DAYS);
        return cal.getTime();
}
}
//71
public class func{
	public void date(int y,int m,int d){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
}
}
//72
public class func{
	public void date(int year,int month,int day,int hour,int minute){
      Calendar c = Calendar.getInstance();
      c.set(Calendar.MILLISECOND, 0);
      return c.getTime();
}
}
//73
public class func{
	public void getNeverExpire(){
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.SECOND, 59);
    return cal.getTime();
}
}
//74
public class func{
	public void getEmptyDate(){
    Calendar cal = Calendar.getInstance();
    cal.set(9999, 11, 31);
    return cal.getTime();
}
}
//75
public class func{
	public void expectedDomainObject(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.MILLISECOND, 0);
    order.setOrderDate(calendar.getTime());
    order.setOrderId(ORDER_ID);
}
}
//76
public class func{
	public void testDateAndTimeExpressions(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 123);
        exchange.getIn().setHeader("birthday", cal.getTime());
}
}
//77
public class func{
	public void sampleDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2008, 3 /* 0-based! */, 24, 19, 10, 45);
        return calendar.getTime();
}
}
//78
public class func{
	public void newDate(int year,int month,int day,int hour,int minute,int second,TimeZone tz){
        Calendar cal = Calendar.getInstance(tz);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
//79
public class func{
	public void newDate(int year,int month,int dayOfMonth){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
//80
public class func{
	public void onDateSet(DatePickerDialog dialog,int year,int monthOfYear,int dayOfMonth){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        Toast.makeText(getSupportActivity(), "Set date: " + DATE_FORMAT.format(calendar.getTime()), Toast.LENGTH_SHORT).show();
}
}
//81
public class func{
	public void timeValue(Date time){
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(time);
        calendar.set(1970, 0, 1);
        return calendar.getTime();
}
}
//82
public class func{
	public void testFriendlyFormatWithoutTime_ReturnsTomorrow_WhenDateIsTomorrow(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(DateUtils.APPLICATION_TIME_ZONE));
        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.MINUTE, 0);
        assertEquals("Tomorrow", df.formatAsDateWithoutTime(cal.getTime()));
}
}
//83
public class func{
	public void add(int field,Date date,int value){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int fieldNewValue = (c.get(field) + value);
    c.set(field, fieldNewValue);
    return c.getTime();
}
}
//84
public class func{
	public void newTime(int hour,int minute,int second){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
        cal.setTimeInMillis(0);
        cal.set(Calendar.SECOND, second);
        return cal.getTime();
}
}
//85
public class func{
	public void testFriendlyFormatWithTime_ReturnsYesterdayAndTime_WhenDateIsYesterday(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(DateUtils.APPLICATION_TIME_ZONE));
        cal.add(Calendar.DAY_OF_YEAR, -1);
        cal.set(Calendar.MINUTE, 30);
        assertEquals("Yesterday at 14:30", df.formatAsDateWithTime(cal.getTime()));
}
}
//86
public class func{
	public void getXDaysAgo(int numberOfDays){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(APPLICATION_TIME_ZONE));
        cal.add(Calendar.DAY_OF_MONTH, -numberOfDays);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
//87
public class func{
	public void serialize(Date object,byte[] stream,int startPosition){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(object);
    calendar.set(Calendar.MILLISECOND, 0);
    dateTimeSerializer.serialize(calendar.getTime(), stream, startPosition);
}
}
//88
public class func{
	public void massageDate(Date date,int hourOfDay,int minute,int second){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.SECOND, second);
        return cal.getTime();
}
}
//89
public class func{
	public void testSqlDate(){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2007, 3, 1, 1, 15);
        Date time = cal.getTime();
        java.sql.Date date = new java.sql.Date(time.getTime());
        String dateTime = DateUtil.serializeSqlDate(date);
        assertEquals("2007-04-01", dateTime);
}
}
//90
public class func{
	public void aStartDayIn10YearsAfter(final Date date){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.YEAR, 10);
    calendar.set(java.util.Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
    return date2SQLDate(calendar.getTime());
}
}
//91
public class func{
	public void getDefaultPreloadBegin(Date date){
        Calendar calendar = Calendar.getInstance(CalendarHelper.getTimeZoneOrDefault(this),
                CalendarHelper.getAsLocale(facesContext, this, getLocale()));
        calendar.setTime(date);
        calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DATE));
        return calendar.getTime();
}
}
//92
public class func{
	public void getDateRange(){
        Calendar then = Calendar.getInstance();
        then.setTime(now);
        then.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return new Date[]{then.getTime(), now};
}
}
//93
public class func{
	public void testSerialize(){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(OBJECT);
    calendar.set(Calendar.MILLISECOND, 0);
    Assert.assertEquals(dateSerializer.deserialize(stream, 0), calendar.getTime());
}
}
//94
public class func{
	public void serialize(Date object,byte[] stream,int startPosition,Object... hints){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(object);
    calendar.set(Calendar.MILLISECOND, 0);
    dateTimeSerializer.serialize(calendar.getTime(), stream, startPosition);
}
}
//95
public class func{
	public void removeTime(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
//96
public class func{
	public void preprocess(Date value,Object... hints){
    final Calendar calendar = Calendar.getInstance();
    calendar.setTime(value);
    calendar.set(Calendar.MILLISECOND, 0);
    return calendar.getTime();
}
}
//97
public class func{
	public void testSerialize(){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(OBJECT);
    calendar.set(Calendar.MILLISECOND, 0);
    Assert.assertEquals(dateSerializer.deserialize(stream, 0), calendar.getTime());
}
}
//98
public class func{
	public void testParseOffset(){
        final Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2015, Calendar.JULY, 4);
        Assert.assertEquals(cal.getTime(), date);
}
}
//99
public class func{
	public void getNextLaunchDate(){
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR));
        calendar.set(Calendar.SECOND, 0);
        return new Date(calendar.getTime().getTime() + MILLISEC_IN_DAY);
}
}
//100
public class func{
	public void date(int year,int month,int day){
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.DAY_OF_MONTH, day);
    return calendar.getTime();
}
}
//101
public class func{
	public void createDate(int day,int month,int year){
    Calendar d = Calendar.getInstance();
    d.clear();
    d.set(Calendar.DATE, day);
    return d.getTime();
}
}
//102
public class func{
	public void testJavaUtilDate(){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2007, 3, 1, 1, 15);
        Date time = cal.getTime();
        String dateTime = DateUtil.serializeDateTime(time);
        assertEquals("2007-04-01T01:15:00", dateTime);
        String date = DateUtil.serializeDate(time);
        assertEquals("2007-04-01", date);
}
}
//103
public class func{
	public void createBirthDate(final int year,final int month,final int dayOfMonth){
    Calendar birthDate = Calendar.getInstance();
    birthDate.clear();
    birthDate.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    return birthDate.getTime();
}
}
//104
public class func{
	public void makeDate(int year,int month,int day){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month-1, day);
        return cal.getTime();
}
}
//105
public class func{
	public void populate(){
    final Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + yearsAhead);
    super.populate(ContentPopulator.CONTENT_PROPERTYSET_PREFIX + ContentValues.EXPIRE_DATE_TIME, calendar.getTime());
}
}
//106
public class func{
	public void dateSerial(int year,int month,int day){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
}
}
//107
public class func{
	public void timestamp(int year,int month,int day,int hour,int minute,int second){
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(year, month - 1, day, hour, minute, second);
    return calendar.getTime();
}
}
//108
public class func{
	public void BindBean(){
      Calendar cal = Calendar.getInstance();
      cal.clear();
      cal.set(Calendar.YEAR, 2008);
      dateProperty = cal.getTime();
}
}
//109
public class func{
	public void createDate(int year,int month,int day,int hour,int minute,int second){
            Calendar c = Calendar.getInstance();
            c.clear();
            c.set(Calendar.SECOND, second);
            return c.getTime();
}
}
//110
public class func{
	public void time(int hour,int minute,int second){
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.SECOND, second);
    return calendar.getTime();
}
}
//111
public class func{
	public void getDefaultExpiration(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, defaultDuration);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
}
}
//112
public class func{
	public void testBasicDateFormat(){
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DateUtils.GMT);
        calendar.set(Calendar.MILLISECOND, 0);
        final Date date = calendar.getTime();
        Assert.assertEquals("Fri, 14 Oct 2005 00:00:00 GMT", DateUtils.formatDate(date));
        Assert.assertEquals("Fri, 14 Oct 2005 00:00:00 GMT", DateUtils.formatDate(date, DateUtils.PATTERN_RFC1123));
}
}
//113
public class func{
	public void deletePrefLogArchive(int dayBefore){
        Calendar before = Calendar.getInstance();
        before.add(Calendar.DATE, -1);
        before.set(Calendar.SECOND, 0);
        prefLogDao.deleteArchivedRecoredByTime(before.getTime());
}
}
//114
public class func{
	public void getLastMonthString(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return monthAndYearFormat.format(calendar.getTime());
}
}
//115
public class func{
	public void getTimestampAsDate(long timestamp){
    Calendar cd = Calendar.getInstance();
    cd.setTimeInMillis(timestamp);
    cd.set(Calendar.MILLISECOND, 0);
    return cd.getTime();
}
}
//116
public class func{
	public void getDate(int year,int month,int day,int hour,int minute,int second,int millisecond){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
}
}
//117
public class func{
	public void computeStartOfNextDay(long now){
    cal.setTime(new Date(now));
    cal.add(Calendar.DAY_OF_MONTH, 1);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    return cal.getTime().getTime();
}
}
//118
public class func{
	public void testDeserInstantFromNumber(){
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(Calendar.YEAR, 1972);
        long timepoint = cal.getTime().getTime();
        Instant instant = MAPPER.readValue(String.valueOf(timepoint), Instant.class);
        assertEquals(timepoint, instant.getMillis());
}
}
//119
public class func{
	public void getInvalidDate(){
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);
        calendar.set(year, month, date);
        return calendar.getTime();
}
}
//120
public class func{
	public void getLocalizedDate(int year,int month,int day){
    Calendar calendar = new GregorianCalendar();
    calendar.clear();
    calendar.set(Calendar.MILLISECOND, 999);
    return df.format(calendar.getTime());
}
}
//121
public class func{
	public void getDateAtMidnight(Date date,TimeZone timeZone){
    Calendar calendar = new GregorianCalendar(timeZone);
    calendar.setTime(date);
    calendar.set(Calendar.MILLISECOND, 0);
    return calendar.getTime();
}
}
//122
public class func{
	public void getDate(int month,int day,int year){
    TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
    Calendar calendar = new GregorianCalendar(gmtTimeZone);
    calendar.set(Calendar.YEAR, year);
    return calendar.getTime();
}
}
//123
public class func{
	public void getEndingDate(){
        calendar.setTime(endingDate.getValue());
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE), 23, 59, 59);
        return calendar.getTime();
}
}
//124
public class func{
	public void getStartingDate(){
        calendar.setTime(startingDate.getValue());
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE), 0, 0, 0);
        return calendar.getTime();
}
}
//125
public class func{
	public void fetchEventsForAMonthWithoutAnyEvents(){
    month.setTime(dateToUseInTests());
    month.add(Calendar.YEAR, 1);
    month.set(Calendar.MONTH, Calendar.MAY);
    List<EventDetail> events = new ArrayList<EventDetail>(eventDAO
        .findAllEventsInPeriod(Period.from(month.getTime(), PeriodType.month, "en"), almanachIds));
}
}
//126
public class func{
	public void PricingFieldTest(String name){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.clear();
        calendar.set(2009, 11, 16);
        DATE_VALUE = calendar.getTime();
        DATE_VALUE_STRING = String.valueOf(DATE_VALUE.getTime());        
}
}
//127
public class func{
	public void setUp(){
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(Calendar.MILLISECOND, 0);
        date = cal.getTime();
}
}
//128
public class func{
	public void date(int year,int month,int day){
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(year, month - 1, day);
        return cal.getTime();
}
}
//129
public class func{
	public void testParse(){
        calendar.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
        calendar.set(Calendar.MILLISECOND, 0);
        assertEquals(calendar.getTime(), newValue);
}
}
//130
public class func{
	public void createBirthDate(int year,int month,int day){
        calendar.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
        calendar.set( year, month - 1, day, 12, 0, 0 );
        return calendar.getTime();
}
}
//131
public class func{
	public void shouldOutputCorrectFormat(){
            then.setTimeZone(TimeZone.getTimeZone("GMT"));
            then.set(1994, 10, 6, 8, 49, 37);
            assertEquals("Date format did not match expected", expected, new HttpDate(then.getTime()).toRFC1123());
}
}
//132
public class func{
	public void date(int year,int month,int day,int hour,int minute,int second){
        c.setTimeZone(TimeZone.getTimeZone("GMT"));
        c.set(year, month-1, day, hour, minute, second);
        return c.getTime();
}
}
//133
public class func{
	public void getDate(String date,int hr,int min){
        cal.setTime(getDate(date));
        cal.set(Calendar.MINUTE, min);
        return cal.getTime();
}
}
//134
public class func{
	public void evaluate(int srcRowIndex,int srcColumnIndex){
    Calendar now = new GregorianCalendar();
    now.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE),0,0,0);
    now.set(Calendar.MILLISECOND, 0);
    return new NumberEval(DateUtil.getExcelDate(now.getTime()));
}
}
//135
public class func{
	public void getLastDayOfNextYear(){
        cal1.set(cal.get(Calendar.YEAR) + 1, cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 0, 0, 0);
        return cal1.getTime();
}
}
//136
public class func{
	public void createDate(final int year,final int month,final int day){
    final Calendar cal = GregorianCalendar.getInstance();
}
}
//137
public class func{
	public void getAmPmTextFor(Integer aHour){
        Calendar someDay = new GregorianCalendar();
        someDay.set(Calendar.HOUR_OF_DAY, aHour);
        return format.format(someDay.getTime());
}
}
//138
public class func{
	public void createStep(Guid taskGuid){
            stepTime.set(Calendar.HOUR, stepTime.get(Calendar.HOUR) -1);
        step.setStartTime(stepTime.getTime());
}
}
//139
public class func{
	public void beforeGWTTest(){
      Calendar cal = new GregorianCalendar();
      cal.set(2010, 10, 24);
      sToday = DateTimeFormat.getFormat("EEE dd MMM").format(cal.getTime());
}
}
//140
public class func{
	public void getStartOfToday(){
  Calendar today = new GregorianCalendar();
  today.set(Calendar.MILLISECOND, 0);
  return today.getTime();
}
}
//141
public class func{
	public void createHeaderRow(){
        Calendar calendar = new GregorianCalendar();
        calendar.set(2009, 7, 1);
        header.setRecordDate(calendar.getTime());
}
}
//142
public class func{
	public void EmploymentPeriodExample2(){
        startCalendar.set(java.util.Calendar.MILLISECOND, 0);
        employmentPeriod.setStartDate(new java.sql.Date(startCalendar.getTime().getTime()));
}
}
//143
public class func{
	public void getPrecedingMidnight(Date date){
        cal.setTimeInMillis(date.getTime() - 1000);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
//144
public class func{
	public void validateDate(Date date){
        calendar.set(1753, 01, 01);
        if(date != null && date.before(calendar.getTime()) ){
            validated = false;
        }
}
}
//145
public class func{
	public void getDefaultValueOfDefaultTime(FacesContext facesContext,AbstractCalendar calendarComponent){
        if (calendarComponent == null) {
            return null;
        }
        Calendar calendar = CalendarHelper.getCalendar(facesContext, calendarComponent);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
}
}
//146
public class func{
	public void monthend(final Date date,final LocalizationContext context){
    final Calendar gc = DateUtil.createCalendar( date, context );
    gc.set( Calendar.DAY_OF_MONTH, gc.getActualMaximum( Calendar.DAY_OF_MONTH ) );
    return gc.getTime();
}
}
//147
public class func{
	public void createTime(Session session,int hour,int minute,int second){
    Calendar c1 = GregorianCalendar.getInstance();
    c1.set(Calendar.SECOND, second);
    Date d = c1.getTime();
}
}
//148
public class func{
	public void createDate1(){
    final Calendar cal = GregorianCalendar.getInstance();
    cal.set( GregorianCalendar.SECOND, 0 );
    return cal.getTime();
}
}
//149
public class func{
	public void getEnd(){
      Calendar cal = this.createCalendar();
      cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
      return DateUtil.endOfDay(cal.getTime());
}
}
//150
public class func{
	public void shouldCovertToIsoString(){
        cal.set(1912, 5, 23, 2, 15, 47);
        the(Convert.toIsoString(cal.getTime())).shouldBeEqual("1912-06-23T02:15:47Z");
}
}
//151
public class func{
	public void shouldCovertToIsoString(){
        cal.set(2014, 11, 31, 23, 59, 59);
        the(Convert.toIsoString(cal.getTime())).shouldBeEqual("2014-12-31T23:59:59Z");
}
}
//152
public class func{
	public void getStart(){
      Calendar cal = this.createCalendar();
      cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
      return DateUtil.startOfDay(cal.getTime());
}
}
//153
public class func{
	public void MonthsCache(final Calendar calendarForInit){
      for (int i = 0; i < 12; i++) {
        calendarForInit.set(Calendar.MONTH, i);
        myCache.put(i, myMonthFormat.format(calendarForInit.getTime()));
      }
}
}
//154
public class func{
	public void WeekDayFormatCache(final Calendar calendarForInit){
      for (int i = 1; i < 8; i++) {
        calendarForInit.set(Calendar.DAY_OF_WEEK, i);
        myCache.put(i, myWeekdayFormat.format(calendarForInit.getTime()));
      }
}
}
//155
public class func{
	public void getMonthYearString(){
    cal.set(mdh.getYear(), mdh.getMonth(), 1);
    return sdfDate.format(cal.getTime());
}
}
//156
public class func{
	public void TestBC(){
        Locale zhTWloc = new Locale("zh", "TW");
        SimpleDateFormat sdf = new SimpleDateFormat("G", zhTWloc);
        Calendar cdar = sdf.getCalendar();
        cdar.set(-2000, 1, 1);
        return Test(sdf.format(cdar.getTime()), "\u897f\u5143\u524d", "BC");
}
}
//157
public class func{
	public void testEncodingDecodingMs(){
        for (int i = 0; i < 1000; i++) {
            cal.set(Calendar.MILLISECOND, i);
            Date date = cal.getTime();
            String encoded = DateParser.formatW3CDateTimeMs(date);
            Date decoded = DateParser.parseW3CDateTime(encoded);
            assertEquals(date, decoded);
        }
}
}
//158
public class func{
	public void getLTDate(Calendar cal){
    Calendar ltCal = (Calendar)cal.clone();
    ltCal.set(Calendar.MILLISECOND, 990);
    return ltCal.getTime();
}
}
//159
public class func{
	public void getGTDate(Calendar cal){
    Calendar gtCal = (Calendar)cal.clone();
    gtCal.set(Calendar.MILLISECOND, 0);
    return gtCal.getTime();
}
}
//160
public class func{
	public void getStart(){
      Calendar cal = this.createCalendar();
      cal.set(Calendar.DAY_OF_MONTH,1);
      return DateUtil.startOfDay(cal.getTime());
}
}
//161
public class func{
	public void widgetSelected(SelectionEvent e){
            cal.set(dp.getYear(), dp.getMonth(), dp.getDay());
            selectedDate = cal.getTime();
}
}
//162
public class func{
	public void createDate(int day,int month,int year){
        Calendar calendar = getInstance();
        calendar.set(MILLISECOND, 0);
        return calendar.getTime();
}
}
//163
public class func{
	public void getEndOfDay(){
    Calendar cal = getCalendar();
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}
}
//164
public class func{
	public void widgetSelected(SelectionEvent e){
                    tmpcal.set(
                        Calendar.MONTH,
                        ((Integer) item
                            .getData("Month")).intValue()); //$NON-NLS-1$
                    setCDTSelection(tmpcal.getTime());
}
}
//165
public class func{
	public void dateUpdatedAfterFocusLostSetup(){
    tester = new CdtTester(getShell(), CDT.BORDER | CDT.DROP_DOWN | CDT.COMPACT);
    tester.setPattern("dd");
    Calendar cal = tester.getCalendarInstance();
    cal.set(Calendar.DATE, 1);
    tester.setSelection(cal.getTime());
    button = new Button(getShell(), SWT.PUSH);
    button.setText("test");
}
}
//166
public class func{
	public void toDate(){
        calendar.set(getYYYY(), getMonth() - 1, getDayOfMonth(), 0, 0, 0);
        return calendar.getTime();
}
}
//167
public class func{
	public void currentLogDate(){
        calendar.set(java.util.Calendar.MILLISECOND, 0);
        java.util.Date today = calendar.getTime();
}
}
//168
public class func{
	public void handleEvent(Event event){
          tmpcal.set(Calendar.AM_PM, (tmpcal.get(Calendar.AM_PM) == 0) ? 1 : 0);
          setSelection(tmpcal.getTime());
          cdt.fireSelectionChanged(Calendar.AM_PM);
}
}
//169
public class func{
	public void getStartOfDay(){
    Calendar cal = getCalendar();
    cal.set(Calendar.MILLISECOND, 1);
    return cal.getTime();
}
}
//170
public class func{
	public void createDate(int year,int month,int day){
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, 0, 0, 0);
        cal.clear(Calendar.MILLISECOND);
        return cal.getTime();
}
}
//171
public class func{
	public void testHolidays(int month,int dayOfMonth){
        Calendar test = Calendar.getInstance();
        test.set(Calendar.HOUR_OF_DAY, 10);
        setNow(test);
        Assert.assertTrue(isHoliday(test), test.getTime().toString() + " is a holiday?");
}
}
//172
public class func{
	public void getLastDayOfMonth(Date date){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    DateUtils.truncateTime(calendar);
    return calendar.getTime();
}
}
//173
public class func{
	public void getTime(int hour,int minutes,Boolean is24Hour){
    calendar.set(Calendar.SECOND, 0);
    truncateDate(calendar);
    return calendar.getTime();
}
}
