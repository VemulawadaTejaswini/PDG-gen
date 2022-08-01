//74
public class func{
	public void run(){
                    if (reader.ready()) {
                        bytes = reader.read(buffer, 0, mMaxNMEABuffer);
                        Message msg = mHandler.obtainMessage(
                                BTGpsLocationProvider.GPS_DATA_AVAILABLE,buffer);
                        lastActivity = System.currentTimeMillis();
                        msg.arg1 = bytes;
                        mHandler.sendMessage(msg);
                    }
}
}
