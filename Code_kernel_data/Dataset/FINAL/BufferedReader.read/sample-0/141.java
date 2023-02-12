public class func{
public void readFile(File f){
    BufferedReader in = new BufferedReader(new FileReader(f));
    for(int c; (c = in.read()) != -1; b.append((char)c));
    in.close();      
}
}
