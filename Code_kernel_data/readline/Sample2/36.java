//35
public class func{
	public void lenArray(BufferedReader reader){
    Object arrayObject = gateway.getObject(reader.readLine());
    reader.readLine();
    int length = Array.getLength(arrayObject);
    ReturnObject returnObject = gateway.getReturnObject(length);
    return Protocol.getOutputCommand(returnObject);
}
}
