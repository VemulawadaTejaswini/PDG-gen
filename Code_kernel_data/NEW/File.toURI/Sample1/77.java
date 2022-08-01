//76
public class func{
	public void startSqoopWithSentryEnable(){
    sqoopServerRunner = new TomcatSqoopRunner(sqoopDir.toString(), SQOOP_SERVER_NAME,
        sentrySitePath.toURI().toURL().toString());
    sqoopServerRunner.start();
}
}
