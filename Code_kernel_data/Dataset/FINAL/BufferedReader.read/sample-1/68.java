public class func{
public void getValue(){
            while ((len = r.read(buf)) != -1) {
                b.append(buf, 0, len);
            }
            r.close();
}
}
