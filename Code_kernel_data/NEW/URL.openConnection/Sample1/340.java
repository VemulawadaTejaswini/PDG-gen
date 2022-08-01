//339
public class func{
	public void HttpTestClient(PostParameters params,HttpActivity activity,String commandName){
        connection = new URL("http://" + NettyHttpServerIT.TEST_HOST + ":" + NettyHttpServerIT.TEST_PORT + "/domain/" + commandName)
                .openConnection();
}
}
