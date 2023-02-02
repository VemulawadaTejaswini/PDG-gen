//70
public class func{
public void getFileContent(String fileName){
    while ((read = in.read(buffer)) >= 0) {
      sb.append(buffer, 0, read);
    }
    in.close();
}
}
