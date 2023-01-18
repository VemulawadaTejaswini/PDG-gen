//4
public class func{
	public void main(String[] args){
        BufferedReader r = new BufferedReader(new StringReader("12"));
        r.read();
        r.mark(2);
        while (r.read() != -1);
        r.reset();
        while (r.read() != -1) {
            count++;
        }
}
}
