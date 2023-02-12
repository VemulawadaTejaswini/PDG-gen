public class func{
public void getFileFromPackage(String filename){
                while ((c = in.read()) > -1) {
                    s.write(c);
                }
                return s.toString();
}
}
