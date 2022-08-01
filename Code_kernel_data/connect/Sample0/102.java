//101
public class func{
	public void start(){
            socket.connect(new InetSocketAddress(mHost, mPort), TIME_OUT);
            if (isConnected = socket.isConnected())
                mDelay = System.currentTimeMillis() - startTime;
            else
                mError = TCP_LINK_ERROR;
}
}
