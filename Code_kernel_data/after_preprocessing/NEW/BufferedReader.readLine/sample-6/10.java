//10
public class func{
public void getNextLine(BufferedReader reader){
        String line = reader.readLine();
        if (line != null) {
            return line;
        } else {
            throw new Exception("Error parsing server status file (unexpectedly ended): "
                    + _file.getPath());
        }
}
}
