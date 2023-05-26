public class func{
public void parseFile(String file,String encoding){
    File path = new File(file);
    FileInputStream in = new FileInputStream(path);
    InputStreamReader inr = new InputStreamReader(in, encoding);
    BufferedReader bfr = new BufferedReader(inr);
    char[] doc = new char[(int) path.length()];
    bfr.read(doc);
}
}
