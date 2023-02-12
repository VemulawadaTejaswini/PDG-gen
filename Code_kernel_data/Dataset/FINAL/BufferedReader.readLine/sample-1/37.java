public class func{
public void fileContent(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null) {
            content += line;
        }
}
}
