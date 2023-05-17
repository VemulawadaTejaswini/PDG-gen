public class func{
public void setArray(BufferedReader reader){
    Object objectToSet = Protocol.getObject(reader.readLine(), gateway);
    reader.readLine();
    Array.set(arrayObject, index, objectToSet);
}
}
