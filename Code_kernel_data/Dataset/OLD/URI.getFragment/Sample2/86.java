//85
public class func{
	public void check(final URI argument){
            BUNDLE.checkArgumentPrintf(argument.isAbsolute(),
                "uriChecks.notAbsolute", argument);
            BUNDLE.checkArgumentPrintf(argument.getFragment() == null,
                "uriChecks.fragmentNotNull", argument);
            BUNDLE.checkArgumentPrintf(argument.getQuery() == null,
                "uriChecks.queryNotNull", argument);
            BUNDLE.checkArgumentPrintf(argument.getPath() != null,
                "uriChecks.noPath", argument);
            BUNDLE.checkArgumentPrintf(argument.getPath().endsWith("/"),
                "uriChecks.noEndingSlash", argument);
}
}
