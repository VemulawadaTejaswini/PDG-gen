public class func{
public void getFileText(String filename){
        while ((line = bufferedReader.readLine()) != null) {
            b.append(line);
        }
        return b.toString();
}
}
