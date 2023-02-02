//146
public class func{
public void antTaskExecutesSuccessfullyWithValidSchemas(){
        File outputDirectory = invokeAntBuild("/ant/build.xml");
        ClassLoader resultsClassLoader = compile(outputDirectory, buildCustomClasspath());
        Class<?> generatedClass = resultsClassLoader.loadClass("com.example.WordDelimit");
}
}
