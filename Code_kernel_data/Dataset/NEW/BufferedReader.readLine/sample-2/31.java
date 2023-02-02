//31
public class func{
public void skipUntilBegin(BufferedReader reader){
         String line = reader.readLine();
         while (line != null && !line.startsWith(BEGIN)) {
            line = reader.readLine();
         }
         return Optional.fromNullable(line);
}
}
