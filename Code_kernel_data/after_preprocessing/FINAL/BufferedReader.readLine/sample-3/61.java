public class func{
public void readAsString(Reader reader){
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line).append("\n");
        }
}
}
