//0
public class func{
	public void defaultParamsDatesTest(){
    SimpleJobTrigger trigger = new SimpleJobTrigger( now.getTime(), nextMonth.getTime(), 1, 1000 );
        + now.getTime().toString() + ", endTime=" + nextMonth.getTime().toString() );
}
}
//1
public class func{
	public void addElapsedTime(int seconds){
        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
        LOGGER.info("Current time: " + calendar.getTime());
        calendar.add(Calendar.SECOND, seconds);
        LOGGER.info("Updated time (+" + seconds + "): " + calendar.getTime());
        long currentTimeSeconds = calendar.getTimeInMillis() / 1000;
}
}
//2
public class func{
	public void run(){
      Calendar calendar = Calendar.getInstance();
      m_hour = calendar.getTime().getHours();
      m_minute =calendar.getTime().getMinutes();
      m_second = calendar.getTime().getSeconds();
}
}
//3
public class func{
	public void testMidnightCalendars(){
    final Calendar utcCal = CalendarUtils.getUTCMidnightCalendar(CalendarTestUtils.createDate("2012-12-23 08:33:24.123", timeZone), timeZone);
    Assert.assertEquals("2012-12-23 00:00:00.000", CalendarTestUtils.formatUTCIsoDate(utcCal.getTime()));
    final Calendar userCal = CalendarUtils.getMidnightCalendarFromUTC(utcCal.getTime(), timeZone);
    Assert.assertEquals("2012-12-22 23:00:00.000", CalendarTestUtils.formatUTCIsoDate(userCal.getTime()));
}
}
//4
public class func{
	public void getDayOfYear(Calendar c){
    Calendar c2 = Calendar.getInstance(c.getTimeZone());
        c2.setTime(c.getTime());
        c2.set(Calendar.DAY_OF_MONTH, 1);
        long diff = c.getTime().getTime() - c2.getTime().getTime();
        return (int)Math.ceil((double)diff / MILLIS_PER_DAY);        
}
}
//5
public class func{
	public void rangeRelativeToDate(Date relativeTo,int startMonths,int endMonths){
        Calendar cal = Calendar.getInstance();
        cal.setTime(relativeTo);
        cal.add(Calendar.MONTH, startMonths);
        Date start = cal.getTime();
        cal.setTime(relativeTo);
        cal.add(Calendar.MONTH, endMonths);
        Date end = cal.getTime();
        return new DateRange(start, end);
}
}
//6
public class func{
	public void getWeek(){
    Calendar cal = Calendar.getInstance();
    Log.d(TAG, "week " + dateFormat.format(cal.getTime()));
    return dateFormat.format(cal.getTime());
}
}
//7
public class func{
	public void startDocument(){
    Calendar cal = Calendar.getInstance();
    today = sdf.format(cal.getTime());
    cal.add(Calendar.DAY_OF_MONTH, 1);
    tomorrow = sdf.format(cal.getTime());
}
}
//8
public class func{
	public void title(final int cell){
        final Calendar d = (Calendar) date.clone();
        d.add(Calendar.DAY_OF_WEEK, cell);
        final String displayName = dayFormat.format(d.getTime()) + " " + d.get(Calendar.DAY_OF_MONTH) + " " + monthFormat.format(d.getTime());
}
}
//9
public class func{
	public void format(int time){
    Calendar calendar = clearTime(new GregorianCalendar());
    calendar.set(HOUR_OF_DAY, time);
    begin = DateFormatUtils.format(calendar.getTime(), TIMEPATTERN);
    calendar.add(HOUR_OF_DAY, 1);
    end = DateFormatUtils.format(calendar.getTime(), TIMEPATTERN);
}
}
//10
public class func{
	public void getYear(){
    Calendar cal = Calendar.getInstance();
    Log.d(TAG, dateFormat.format(cal.getTime()));
    return dateFormat.format(cal.getTime());
}
}
//11
public class func{
	public void getYear(){
        Calendar cal = Calendar.getInstance();
        Log.d(TAG, dateFormat.format(cal.getTime()));
        return dateFormat.format(cal.getTime());
}
}
//12
public class func{
	public void twoSameDateTimesAreEqual(){
    Calendar aDate = getInstance();
    DateTime expected = new DateTime(aDate.getTime());
    DateTime actual = new DateTime(aDate.getTime());
}
}
//13
public class func{
	public void rangeToTitle(Calendar start,Calendar end,WaybackRequest wbRequest){
    endMinusSecond.setTime(end.getTime());
    endMinusSecond.add(Calendar.SECOND,-1);
        start.getTime(),endMinusSecond.getTime());
}
}
//14
public class func{
	public void getBeginDate(Calendar calendar,Date endDate,List<Date> holidays){
    calendar.setTime(endDate);
    calendar.add(Calendar.DATE, 1);
    while (holidays.contains(calendar.getTime())) {
      calendar.add(Calendar.DATE, 1);
    }
    return calendar.getTime();
}
}
//15
public class func{
	public void testMergeTranslationWorkSameStateAndContent(){
        Calendar c = new GregorianCalendar();
            generateTarget(ContentState.Translated, c.getTime(), content);
        c.add(Calendar.DATE, 30);
            generateTarget(ContentState.Translated, c.getTime(), content);
        testShouldMergeCondition(target1, target2, false, false);
}
}
//16
public class func{
	public void rangeToTitle(Calendar start,Calendar end,WaybackRequest wbRequest){
    end2.setTime(end.getTime());
    end2.add(Calendar.DAY_OF_YEAR,-1);
        start.getTime(),end2.getTime());
}
}
//17
public class func{
	public void epochSeconds(){
    Calendar standard = Calendar.getInstance();
    standard.set(2012, 5, 6);
    logger.debug("standard : " + standard.getTime());
    Calendar now = Calendar.getInstance();
    logger.debug("now : " + now.getTime());
    logger.debug("epochSeconds : " + RankingUtils.epochSeconds(standard, now));
}
}
//18
public class func{
	public void testMergeTranslationWorkCheckDate2(){
        Calendar c = new GregorianCalendar();
                generateTarget(ContentState.Translated, c.getTime(), "string1");
        c.add(Calendar.DATE, 30);
                generateTarget(ContentState.Translated, c.getTime(), "string2");
        testShouldMergeCondition(target1, target2, true, false);
}
}
//19
public class func{
	public void isBabyBoomer(){
    Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
    Date boomStart = gmtCal.getTime();
    gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
    Date boomEnd = gmtCal.getTime();
    return birthDate.compareTo(boomStart) >= 0
        && birthDate.compareTo(boomEnd) < 0;
}
}
//20
public class func{
	public void context(int elapsedMinutes){
        VerifyContext result = new VerifyContext(new TestContext.Empty(), calendar.getTime());
        calendar.add(Calendar.MINUTE, elapsedMinutes);
        result.setTestFinished(calendar.getTime());
}
}
//21
public class func{
	public void init(){
    calendar.setTime(new Date());
    calendar.set(0, 0, 0, 10, 10);
    this.min = calendar.getTime();
    calendar.set(0, 0, 0, 12, 10);
    this.max = calendar.getTime();
}
}
//22
public class func{
	public void assertEqualDates(){
        Calendar cal = Calendar.getInstance();
        cal.set(2010, Calendar.JANUARY, 1, 12, 0, 0);
        Date expected = cal.getTime();
        cal.set(2010, Calendar.JANUARY, 1, 13, 1, 1);
        Date actual = cal.getTime();
        DroidFuAssertions.assertDateEquals(expected, actual);
}
}
//23
public class func{
	public void setUp(){
        Calendar cal = Calendar.getInstance();
        cal.set(1981, 6, 25);
        position1 = new DefaultPosition(cal.getTime());
        cal.set(2012, 0, 1);
        position2 = new DefaultPosition(cal.getTime());
}
}
//24
public class func{
	public void main(String[] args){
                now.getTimeZone().inDaylightTime(now.getTime()));
        System.out.println(date_format.format(now.getTime()));
}
}
//25
public class func{
	public void compare(Calendar a,Calendar b){
        System.out.println(f.format(a.getTime())+" vs "+f.format(b.getTime()));
        assertEquals(a,b);
}
}
//26
public class func{
	public void checkEventuality(Calendar start,String crontabFormat,Calendar limit){
                    + " Limit: " + f.format(limit.getTime())
                    + " Next: " + f.format(next.getTime());
            fail(msg);
}
}
//27
public class func{
	public void shouldGetTimesheetEntriesInRangeForUser(){
        DateRange dateRange = new DateRange(dateStart.getTime(), dateEnd.getTime());
        List<TimesheetEntry> results = timesheetDAO.getTimesheetEntriesInRange(1, dateRange);
        assertEquals(9, results.size());
}
}
//28
public class func{
	public void fillData(Calendar open,Calendar close){
        currentTask = new MonthlyPreviewTask(open.getTime(), close.getTime(), new Date());
}
}
//29
public class func{
	public void testRangeWithTwoInitialSelections(){
    Calendar nov24 = buildCal(2012, NOVEMBER, 24);
    List<Date> selectedDates = Arrays.asList(nov18.getTime(), nov24.getTime());
}
}
//30
public class func{
	public void twoSameDatesAreEqual(){
    Calendar aDate = getInstance();
    Date expected = new Date(aDate.getTime());
    Date actual = new Date(aDate.getTime());
}
}
//31
public class func{
	public void testParseRfc822Updated1123(){
        assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
        assertEquals(expected.getTime(), actual.getTime());
}
}
//32
public class func{
	public void testParseTimeZoneSeparatedByT(){
        assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
        assertEquals(expected.getTime(), actual.getTime());
}
}
//33
public class func{
	public void testDateHeaderConversion(){
        Calendar cal = org.jaudiotagger.audio.asf.util.Utils.getDateOf(BigInteger.valueOf(1964448000));
        System.out.println(cal.getTime());
        assertEquals(-11644273555200l,cal.getTimeInMillis());
}
}
//34
public class func{
	public void test_getEndOfToday(){
        assertEquals(dateFormat.format(today.getTime()), dateFormat.format(date));
}
}
//35
public class func{
	public void determineFutureRepaymentHolidayWhenDateIsNotRegularHoliday(){
        Calendar date = toCalendar("01-Nov-2010");
        String holidayAsString = new DateTime(date.getTime().getTime()).toLocalDate().toString();
}
}
//36
public class func{
	public void shouldDetermineIfWorkingDay(){
        Calendar holiday = toCalendar("01-Nov-2010");
        DateTime holidayAsDateTime = new DateTime(holiday.getTime().getTime());
        String holidayAsString = holidayAsDateTime.toLocalDate().toString();
}
}
//37
public class func{
	public void assertEquals(Calendar c1,Calendar c2){
            assertEquals(c1.getTimeZone(), c2.getTimeZone());
            assertEquals(c1.getTime(), c2.getTime());
}
}
//38
public class func{
	public void testParseRfc822Updated1123(){
        assertEquals(expected.getTime(), actual.getTime());
}
}
//39
public class func{
	public void convertMultipleDates(){
    assertEquals("foo-2003.05/2003.05.20.txt", fnp.convert(cal.getTime()));
}
}
//40
public class func{
	public void canLoan(Patron borrower){
    return allowedAfter.getTime().getTime() < today.getTime().getTime();
}
}
//41
public class func{
	public void canLoan(Patron borrower){
    Calendar allowedAfter = determineAllowedAfterDate(borrower);
    Calendar today = determineTodaysDate();
    return allowedAfter.getTime().getTime() < today.getTime().getTime();
}
}
//42
public class func{
	public void assertEquals(Calendar c1,Calendar c2){
            assertEquals(c1.getTime(), c2.getTime());
}
}
//43
public class func{
	public void test_getToday(){
        assertEquals(dateFormat.format(today.getTime()), dateFormat.format(date));
}
}
//44
public class func{
	public void dateWithTimeZone(){
    assertEquals("foo2003-05-20T18:55", fnp.convert(cal.getTime()));
}
}
//45
public class func{
	public void canLoan(Patron borrower){
    Calendar allowedAfter = determineAllowedAfterDate(borrower);
    Calendar today = determineTodaysDate();
    return allowedAfter.getTime().getTime() < today.getTime().getTime();
}
}
//46
public class func{
	public void canLoan(Patron borrower){
    return allowedAfter.getTime().getTime() < today.getTime().getTime();
}
}
//47
public class func{
	public void testParseTimeZoneSeparatedByT(){
        assertEquals(expected.getTime(), actual.getTime());
}
}
//48
public class func{
	public void processSensorData(){
    Log.d(TAG, "Last boot: "+calendar.getTime().toString());
}
}
//49
public class func{
	public void objectListConverter(){
    assertEquals("foo-2003.05.20-79.txt", fnp.convertMultipleArguments(cal
        .getTime(), 79));
}
}
//50
public class func{
	public void assertDatePattern(final String pattern,final int year,final int month,final int day,final int hour,final int min,final String expected){
        assertEquals(expected,
            policy.format(cal.getTime()));
}
}
//51
public class func{
	public void testLang538(){
        assertEquals(cal.getTime(), parser.parse("2009-10-16T16:42:16.000Z"));
}
}
//52
public class func{
	public void handleAsCalendar(Calendar value){
        int n = value.get(Calendar.MILLISECOND) * 1000;
        super.setValueInternal(LocalDateTime.of(LocalDate.ofEpochDay(value.getTime().getTime()), LocalTime.of(h, i, s, n)));
}
}
//53
public class func{
	public void testDTOBuilderGetValue(){
        Assert.assertEquals(c.getTime(), cal.getTime());
}
}
//54
public class func{
	public void testQuotes(){
        assertEquals(cal.getTime(), fdf.parse("'20030210A'B153320989'"));
}
}
//55
public class func{
	public void toDate(){
        final Calendar c = this.toCalendar();
        return c.getTime();
}
}
//56
public class func{
	public void rangeToTitle(Calendar start,Calendar end,WaybackRequest wbRequest){
        start.getTime(),end2.getTime());
}
}
//57
public class func{
	public void updateMonths(){
      picker.getControl().show(tmpcal.getTime());
}
}
//58
public class func{
	public void isNoOverlap(final Calendar dat1,final Calendar dat2){
            return DateHelper.minutesBetween(dat1.getTime(), dat2.getTime(), false, false) >= 0;
}
}
//59
public class func{
	public void isNoOverlap(final Calendar dat1,final Calendar dat2){
            return DateHelper.minutesBetween(dat1.getTime(), dat2.getTime(), false, false) >= 0;
}
}
//60
public class func{
	public void getMonthAndYearString(CalendarDay day){
        sbuf.append(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
        sbuf.append(" ");
        sbuf.append(YEAR_FORMAT.format(cal.getTime()));
        return sbuf.toString();
}
}
//61
public class func{
	public void getScanTimeUTC(int lineNumber){
        return ProductData.UTC.create(imageEndDate.getTime(), firstImageFile.getMicrosecondsOfLine(lineNumber) + remainingMillis * 1000);
}
}
//62
public class func{
	public void allowsSettingNewStartAsCalendar(){
        assertEquals(start.getTime(), sequence.nextValue());
}
}
//63
public class func{
	public void createHourlyRawFile(File outputFile,Calendar calendar){
        store.setTime(calendar.getTime());
        store.store(outputFile);
}
}
//64
public class func{
	public void testLastModified(){
    assertEquals("Invalid Date header", calendar.getTime(), getDateFromHeader(headers, "last-modified"));
}
}
//65
public class func{
	public void testDTOBuilderGetValue(){
        Assert.assertEquals(c.getTime(), cal.getTime());
}
}
//66
public class func{
	public void setCalendar(PreparedStatement stmnt,int idx,Calendar val,Column col){
        setDate(stmnt, idx, val.getTime(), col);
}
}
//67
public class func{
	public void assertPastEvent(final Calendar start,final boolean expectedPast){
        cache.setHidden(start.getTime());
        assertThat(CalendarUtils.isPastEvent(cache)).isEqualTo(expectedPast);
}
}
//68
public class func{
	public void testInitMidyear(){
    view.init(may2012.getTime(), may2013.getTime(), locale) //
}
}
//69
public class func{
	public void testInitJanuary(){
    view.init(jan2012.getTime(), jan2013.getTime(), locale) //
}
}
//70
public class func{
	public void testInitDecember(){
    view.init(dec2012.getTime(), dec2013.getTime(), locale) //
}
}
//71
public class func{
	public void getAsDate(TimeZone timeZone){
    Calendar c = getAsCalendar(timeZone);
    return c.getTime();
}
}
//72
public class func{
	public void encode(Object object){
            return DateParser.formatW3CDateTime(((Calendar) object).getTime());
}
}
//73
public class func{
	public void convertTo(Serializable value,Class<T> toType){
            return (T) ((Calendar) value).getTime();
}
}
//74
public class func{
	public void getNotBefore(){
        NativeCrypto.ASN1_TIME_to_Calendar(NativeCrypto.X509_get_notBefore(mContext), calendar);
        return calendar.getTime();
}
}
//75
public class func{
	public void setDailyExpiryTime(Calendar dailyExpiryTime){
        setDailyExpiryTime(dailyExpiryTime.getTime());
}
}
//76
public class func{
	public void HourInterval(Calendar froms,Calendar tos){
            this(froms.getTime(), tos.getTime());
}
}
//77
public class func{
	public void HourInterval(Calendar froms,Calendar tos){
            this(froms.getTime(), tos.getTime());
}
}
//78
public class func{
	public void setupDocTest(){
        return ((Calendar) testDocument.getPropertyValue("dc:modified")).getTime();
}
}
//79
public class func{
	public void print_calendar(Calendar cal){
        print(cal.getTime());
}
}
//80
public class func{
	public void testDayOf(){
        assertEquals(cal.getTime(), fdf.parse("3 7 2 41 03"));
}
}
//81
public class func{
	public void fromApiTime(Calendar fromCal,int durationInHour){
          gregorian.setTime(fromCal.getTime());
}
}
//82
public class func{
	public void toType(final Calendar value){
        return value.getTime();
}
}
//83
public class func{
	public void testShowingOnlyOneMonth(){
    view.init(feb1.getTime(), mar1.getTime(), locale) //
}
}
//84
public class func{
	public void getFullFileName(Calendar calendar){
      String fullFileName = fileName + "." + fileSuffixDateFormat.format(calendar.getTime());
}
}
//85
public class func{
	public void getQueryBuilder(){
    builder.setWhere(builder.where().ge(RedmineRecentIssue.MODIFIED, cal.getTime()));
}
}
//86
public class func{
	public void getFormattableObject(Object value,Locale locale,TimeZone timeZone,MustacheTagInfo tagInfo){
            return ((Calendar) value).getTime();
}
}
//87
public class func{
	public void getFormattableObject(Object contextObject){
            return ((Calendar) contextObject).getTime();
}
}
//88
public class func{
	public void isDateWithinRange(Calendar calendar,DateRange dateRange){
        return DateUtil.isDateWithinRange(calendar.getTime(), dateRange);
}
}
//89
public class func{
	public void getMillisecondsOfCalendar(Calendar aCalendar){
    return aCalendar.getTime().getTime();
}
}
//90
public class func{
	public void doAsyncHarvest(HarvestingDataverse dataverse){
        timerService.createTimer(cal.getTime(), new HarvestTimerInfo(dataverse.getId(), dataverse.getVdc().getName(), dataverse.getSchedulePeriod(), dataverse.getScheduleHourOfDay(), dataverse.getScheduleDayOfWeek()));
}
}
//91
public class func{
	public void addSeconds(Long l){
        das.date = cal.getTime();        
}
}
//92
public class func{
	public void findUpCommingEvents(){
        List<Event> events = query.from(qEvent).where(qEvent.endDate.gt(today.getTime()), qEvent.parent.isNull()).orderBy(qEvent.startDate.asc()).list(qEvent);
        return loadVenues(events);
}
}
//93
public class func{
	public void rangeToTitle(Calendar start,Calendar end,WaybackRequest wbRequest){
        start.getTime(),endMinusSecond.getTime());
}
}
//94
public class func{
	public void getNumberOfDaysBetweenTwoDates(Date date1,Date date2){
        return ((cal1.getTime().getTime() - cal2.getTime().getTime()) / (24 * 60 * 60 * 1000));
}
}
//95
public class func{
	public void testCalendarConverter(){
    assertEquals(cal.getTime(), cal2.getTime());
}
}
//96
public class func{
	public void parse(String isodate){
    Calendar calendar = getCalendar(isodate);
    return calendar.getTime();
}
}
//97
public class func{
	public void getToday(Calendar calendar){
        Date today = calendar.getTime();
        today.setTime(today.getTime() / 1000L * 1000L);
        today.setHours(12);
        today.setMinutes(0);
        today.setSeconds(0);
}
}
//98
public class func{
	public void getValue(){
    final Calendar calendar = getCalendar();
    configureCalendar( calendar );
    return calendar.getTime();
}
}
//99
public class func{
	public void tomorrow(){
    Calendar calendar = DateUtils.todayCalendar();
    return DateUtils.addDays(calendar.getTime(), 1);
}
}
//100
public class func{
	public void shouldProvideStringForDate(){
        assertThat(new JcrValue(factories, PropertyType.DATE, date.getTime()).getString().substring(0, expectedValue.length()),
                   is(expectedValue));
}
}
//101
public class func{
	public void format(Calendar cal){
        return parsers[0].format(cal.getTime());
}
}
//102
public class func{
	public void toString(Calendar cal){
      string = format.format(cal.getTime());
}
}
//103
public class func{
	public void isAfterEnd(Calendar cal){
        return cal.getTime().after(end);
}
}
//104
public class func{
	public void getExpirationDate(int futureDays){
        return formatter.format(calendar.getTime());
}
}
//105
public class func{
	public void convertWallclockTime(Calendar time){
        long t = time.getTime().getTime();
}
}
//106
public class func{
	public void getFolderName(Calendar cal){
    return dateFormatter.get().format(cal.getTime());
}
}
//107
public class func{
	public void setValue(Calendar calendar){
        this.value = calendar.getTime();
}
}
//108
public class func{
	public void AtomDate(Calendar value){
        this(value.getTime());
}
}
//109
public class func{
	public void formatterShouldUseNewFormat(){
    assertThat(Formatter.formatDateTime(calendar.getTime()), is("1999-11-11"));
}
}
//110
public class func{
	public void update(){
    Clock clock = Clock.getInstance();
    Calendar cal = clock.getCalendar();
        Date date = cal.getTime();
}
}
//111
public class func{
	public void show(OutputStreamWriter out){
  out.write(c.getTime().toString());
  out.write("<P><A HREF=\"demo.html\">Return to the home page.</A>");
}
}
//112
public class func{
	public void testParser4(){
        assertEquals(ref.getTime(), cal.getTime());
}
}
//113
public class func{
	public void widgetSelected(SelectionEvent e){
        person.setBirthday(cal.getTime());
}
}
//114
public class func{
	public void testParser2(){
        assertEquals(ref.getTime(), cal.getTime());
}
}
//115
public class func{
	public void getThisQuarter(Calendar referenceCalendar){
            Quarter quarter = new Quarter(referenceCalendar.getTime());
}
}
//116
public class func{
	public void toString(Object object,ConverterContext context){
            return _defaultFormat.format(((Calendar) object).getTime());
}
}
