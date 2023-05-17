public class func{
public void requireLine(BufferedReader reader){
        String line = reader.readLine();
        if (line == null) {
            throw new IllegalStateException("Expected line bug got EOF");
        }
}
}
