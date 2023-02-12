public class func{
public void getDefaultNTJSON(){
    while ((currentLine = in.readLine()) != null) {
      fileContent.append(currentLine);
    }
    return fileContent.toString();
}
}
