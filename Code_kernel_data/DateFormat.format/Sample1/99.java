//98
public class func{
	public void doBuildTimestamp(StaplerRequest req,StaplerResponse rsp,@QueryParameter String format){
        rsp.getWriter().print(df.format(getTime()));
}
}
