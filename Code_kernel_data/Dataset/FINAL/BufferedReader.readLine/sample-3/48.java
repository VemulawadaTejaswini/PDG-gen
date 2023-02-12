public class func{
public void readFile(String fileName){
        while ((s = reader.readLine()) != null) {
            sb.append(s); sb.append("\n");
        }
        reader.close();
}
}
