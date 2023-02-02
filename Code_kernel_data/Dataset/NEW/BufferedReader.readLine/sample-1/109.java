//109
public class func{
public void forwardToTag(String tagName,BufferedReader br){
        while ((sCurrentLine = br.readLine()) != null) {
            String lowerCaseLine = sCurrentLine.toLowerCase();
            if (lowerCaseLine.indexOf(tagName) >= 0) {
                return true;
            }
        }
}
}
