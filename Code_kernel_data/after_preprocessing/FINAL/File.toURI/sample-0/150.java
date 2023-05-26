public class func{
public void testFileUriToMissingFile(){
        File f = new File(Environment.getExternalStorageDirectory() + "/somefilethatdoesntexist");
        Uri fileUri = Uri.parse(f.toURI().toString());
            performApiTest(fileUri, null, f, false, true);
            f.delete();
}
}
