//60
public class func{
	public void getReader_read_receiveStringFromStream(){
        BufferedReader reader = sut(stream, mockOutput()).getReader();
        String result = reader.readLine();
}
}
