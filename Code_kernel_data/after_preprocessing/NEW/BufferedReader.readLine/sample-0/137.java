//137
public class func{
public void main(String[] args){
    OutputStream out = new FileOutputStream("out.txt");
    System.setIn(new TeeInputStream(System.in, out));
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
}
}
