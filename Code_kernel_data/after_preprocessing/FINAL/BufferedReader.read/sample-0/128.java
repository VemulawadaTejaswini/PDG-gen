public class func{
public void assertFileContents(String expected,File file){
            reader = new BufferedReader(new FileReader(file));
            while (-1 != (howMany = reader.read(buffer))) {
                contents.append(buffer, 0, howMany);
            }
            assertEquals("checking file contents for " + file,
                         expected,
                         contents.toString());
}
}
