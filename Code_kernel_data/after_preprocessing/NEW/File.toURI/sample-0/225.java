//225
public class func{
public void configureShell(CpsFlowExecution context,GroovyShell shell){
            shell.getClassLoader().addURL(new File(repo.workspace,"src").toURI().toURL());
}
}
