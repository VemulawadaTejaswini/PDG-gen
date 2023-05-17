//74
public class func{
public void main(String[] args){
        while ((n = in.read(buf)) != -1) {
            out.write(buf, 0, n);
            System.err.print(" " + n);
        }
        in.close();
}
}
