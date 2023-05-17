//22
public class func{
public void asString(Reader reader){
        BufferedReader br = new BufferedReader(reader);
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        return sb.toString();
}
}
