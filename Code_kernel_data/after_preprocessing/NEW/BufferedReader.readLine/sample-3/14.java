//14
public class func{
public void streamToString(BufferedReader in){
        while ((line = in.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
}
}
