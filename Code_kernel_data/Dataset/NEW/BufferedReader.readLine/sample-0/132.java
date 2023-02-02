//132
public class func{
public void assertReadText(Path f){
    InputStream ir = StreamUtils.inputStream(f);
    InputStreamReader in = new InputStreamReader(ir, StandardCharsets.UTF_8);
    BufferedReader r = new BufferedReader(in);
    String line = r.readLine();
}
}
