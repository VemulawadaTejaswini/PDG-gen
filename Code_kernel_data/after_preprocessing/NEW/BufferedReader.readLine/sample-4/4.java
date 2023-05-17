//4
public class func{
public void verifyOutput(FileSystem fs,Path outDir){
    InputStream is = fs.open(outputFiles[0]);
    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    String s = reader.readLine().split("\t")[1];
    assertEquals("b a",s);
    assertNull(reader.readLine());
    reader.close();
}
}
