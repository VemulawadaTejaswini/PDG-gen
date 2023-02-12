public class func{
public void sourceFile(File f){
    BufferedReader dotRc = new BufferedReader(new FileReader(f));
    while(null != (line = dotRc.readLine())) {
      shell.executeCommand(line);
    }
}
}
