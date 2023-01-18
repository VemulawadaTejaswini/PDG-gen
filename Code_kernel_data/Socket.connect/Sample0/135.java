//134
public class func{
	public void isLocalPortOccupied(int portNum){
            s.connect(new InetSocketAddress(portNum));
            return s.isConnected();
}
}
