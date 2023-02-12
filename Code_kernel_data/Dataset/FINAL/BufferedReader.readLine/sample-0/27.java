public class func{
public void dumpStream(InputStream stream){
            new BufferedReader(new InputStreamReader(stream));
        while ((line = in.readLine()) != null) {
            outStream.println(line);
        }
}
}
