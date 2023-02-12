public class func{
public void shouldAllowEmptyPackageName(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/emptyPackageName", "",
                config("includes", new String[] {}, "excludes", new String[] {}));
        resultsClassLoader.loadClass("levelOne.levelTwo.LevelTwoType");
}
}
