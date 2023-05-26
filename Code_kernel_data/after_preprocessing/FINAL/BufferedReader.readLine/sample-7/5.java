public class func{
public void testReadHeader(){
        final BufferedReader reader = new BufferedReader(new StringReader(file));
        final String[] header = reader.readLine().split("\t");
}
}
