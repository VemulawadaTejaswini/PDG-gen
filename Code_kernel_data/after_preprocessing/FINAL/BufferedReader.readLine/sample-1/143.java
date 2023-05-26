public class func{
public void readFromFile(String filename){
    while ((line = reader.readLine()) != null) writer.write(line + "\n");
    return writer.getBuffer().toString();
}
}
