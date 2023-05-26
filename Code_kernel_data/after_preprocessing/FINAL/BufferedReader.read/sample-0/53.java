public class func{
public void receiveFile(){
    BufferedReader reader = new BufferedReader(new FileReader(output));
    while ((read = reader.read()) != -1)
      buffer.append((char) read);
    reader.close();
}
}
