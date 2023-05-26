//29
public class func{
public void readResource(BufferedReader reader){
            for (int c = reader.read(); c > -1; c = reader.read()) {
                resource.append((char) c);
            }
            return resource.toString();
}
}
