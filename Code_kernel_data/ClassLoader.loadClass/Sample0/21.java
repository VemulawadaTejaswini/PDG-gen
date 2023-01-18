//20
public class func{
	public void disablingJodaLocalTimesCausesStrings(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example",
                config("useJodaLocalTimes", false));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsTime", "java.lang.String");
}
}
