//173
public class func{
	public void startSystem(final String[] environment,final File karafBase){
        Thread thread = new Thread("KarafJavaRunner") {
            @Override
            public void run() {
                CommandLineBuilder commandLine = createCommandLine(environment, karafBase);
                runner.exec(commandLine, karafBase, environment);
            }
        };
        thread.start();
}
}
