//51
public class func{
	public void getGMetric(String metricName){
        Socket gangliaXMLSocket = new Socket("localhost", 8649);
        BufferedReader in = new BufferedReader(new InputStreamReader(
                gangliaXMLSocket.getInputStream()));
        int in_buff = in.read(charBuff, 0, buffSize);
        if (in_buff != -1) {
            System.out.println("End of file");
        }
        CharArrayReader car = new CharArrayReader(charBuff, 0, in_buff); // these two lines have to be here.
        BufferedReader br_car = new BufferedReader(car);
}
}
