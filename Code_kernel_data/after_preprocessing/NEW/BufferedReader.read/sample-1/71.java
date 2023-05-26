//71
public class func{
public void readFileAsString(File file){
            while((numRead=reader.read(buf)) != -1){
                fileData.append(buf, 0, numRead);
            }
            reader.close();
}
}
