//19
public class func{
	public void getAnswer(BufferedReader in,PrintWriter out,String command){
        log(Level.TRACE, "status code: %d", statuscode);
        if((statuscode != 200 && statuscode != 500) || size < 1) {
            log(Level.ERROR, "communication error, code: %d, byte expected: %d", statuscode, size);
            return new BufferedReader(new CharArrayReader(new char[0]));
        }
        int readchar = in.read(cbuf);
        if( readchar != size ) {
            log(Level.ERROR, "read failed, not enough byte, got %d expected %d", readchar, size);
            return new BufferedReader(new CharArrayReader(new char[0]));
        }
        in.readLine();
        return new BufferedReader(new CharArrayReader(cbuf));
}
}
