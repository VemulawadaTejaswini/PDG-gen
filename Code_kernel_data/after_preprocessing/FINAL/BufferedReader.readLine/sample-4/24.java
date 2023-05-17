public class func{
public void testUnresolvablePlaceholdersDontCrash(){
    ClassLoader classLoader = ModuleUtils.createModuleRuntimeClassLoader(definition, options, ModuleUtilsTests.class.getClassLoader());
    String value = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream("a_file"))).readLine();
}
}
