public class func{
public void toString(final BufferedReader reader){
        while ((line = reader.readLine()) != null) {
            builder.append(line).append(LINE_SEPARATOR);
        }
}
}
