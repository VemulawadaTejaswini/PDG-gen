//18
public class func{
public void executeCommand(String command){
        while ((read = reader2.read(buffer)) > 0) {
          output2.append(buffer, 0, read);
        }
        reader2.close();
}
}
