public class func{
public void getLogContents(String logfile){
    while((numRead = reader.read(buf)) !=-1) {
      String readData = String.valueOf(buf, 0,numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    return fileData.toString();
}
}
