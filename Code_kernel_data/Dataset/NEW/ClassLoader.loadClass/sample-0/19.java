//19
public class func{
public void disablingJodaDatesCausesJavaUtilDates(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example",
                config("useJodaDates", false));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsDateTime", "java.util.Date");
}
}
