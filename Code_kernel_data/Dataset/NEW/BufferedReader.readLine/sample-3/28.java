//28
public class func{
public void read(InputStream is){
        while((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
}
}
