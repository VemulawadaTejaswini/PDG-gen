public class func{
public void readTextFileAsString(String fileName){
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
}
}
