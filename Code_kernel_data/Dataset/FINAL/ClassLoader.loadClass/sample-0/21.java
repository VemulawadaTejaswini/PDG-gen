public class func{
public void useJodaLocalTimesCausesJodaLocalTimeDates(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example",
                config("useJodaLocalTimes", true));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsTime", "org.joda.time.LocalTime");
}
}
