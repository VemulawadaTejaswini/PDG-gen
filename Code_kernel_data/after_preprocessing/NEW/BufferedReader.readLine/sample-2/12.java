//12
public class func{
public void readNextLine(BufferedReader reader){
        String line = reader.readLine();
        while (line != null && (line.isEmpty() || line.trim().startsWith("//"))) {
            line = reader.readLine();
        }
}
}
