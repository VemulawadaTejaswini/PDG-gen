//60
public class func{
public void asString(InputStream stream){
        BufferedReader bin = new BufferedReader(new InputStreamReader(stream));
        while((line = bin.readLine()) != null)
            sb.append(line).append('\n');
        stream.close();
}
}
