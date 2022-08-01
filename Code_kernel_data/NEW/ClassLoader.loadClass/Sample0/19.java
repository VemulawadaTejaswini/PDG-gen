//18
public class func{
	public void useJodaLocalDatesCausesJodaLocalDateDates(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example", config
                ("useJodaLocalDates", true));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsDate", "org.joda.time.LocalDate");
}
}
