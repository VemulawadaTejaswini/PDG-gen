//52
public class func{
	public void getArray(BufferedReader reader){
    reader.readLine();
    Object getObject = Array.get(arrayObject, index);
    ReturnObject returnObject = gateway.getReturnObject(getObject);
    return Protocol.getOutputCommand(returnObject);
}
}
