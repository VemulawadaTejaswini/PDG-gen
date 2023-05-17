public class func{
public void copy(String filename,PrintStream out){
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while ((s = br.readLine()) != null) {
            out.println(s);
        }
}
}
