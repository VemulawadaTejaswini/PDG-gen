//171
public class func{
public void testSplitMultiLine(){
        BufferedReader br = new BufferedReader(new StringReader(line));
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{"a","","c\nd","e"}, out);
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{"","","f","g",""}, out);
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{""}, out); // Blank line
        assertEquals("Expected to be at EOF",-1,br.read());
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{}, out);
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{}, out);
}
}
