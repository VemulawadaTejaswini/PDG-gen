//14
public class func{
public void toString(InputStream input){
            String line = reader.readLine();
            if (line == null) {
                return builder.toString();
            }
            builder.append(line);
}
}
