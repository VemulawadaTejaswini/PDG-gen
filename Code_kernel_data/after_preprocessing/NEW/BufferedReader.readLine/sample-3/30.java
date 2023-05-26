//30
public class func{
public void testReconsumeStreamXml(InputStream input){
        while ((line = reader.readLine()) != null) {
            buf.append(line);
        }
        return new ByteArrayInputStream(buf.toString().getBytes());
}
}
