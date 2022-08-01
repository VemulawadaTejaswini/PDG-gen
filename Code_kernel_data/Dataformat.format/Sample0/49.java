//48
public class func{
	public void convertToiCal4JCompatibleDate(final LocalDate inputDate){
        final String seedDateStr = df.format(inputDate.toDateTimeAtStartOfDay().toDate());
            formattedDate = new Date(seedDateStr, "yyyy-MM-dd");
}
}
