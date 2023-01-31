//46
public class func{
	public void getCompileMethod(ClassLoader cl){
        return ScalaReflectionUtil.scalaMethod(
            cl,
            "play.routes.compiler.RoutesCompiler",
            "compile",
            cl.loadClass("play.routes.compiler.RoutesCompiler$RoutesCompilerTask"),
            cl.loadClass("play.routes.compiler.RoutesGenerator"),
            File.class
        );
}
}
