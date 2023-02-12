public class func{
public void catInto(String src,String dest){
        BufferedReader in = new BufferedReader(new FileReader(src));
        while ((str = in.readLine()) != null) {
            out.write(str);
        }
        in.close();
}
}
