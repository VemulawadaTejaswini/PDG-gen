import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class Main {

	static FastReaderR in = new FastReaderR(System.in) ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String num = in.next() ;
		BigInteger b = new BigInteger(num) ;
		BigInteger temp = BigInteger.ONE ;
		BigInteger sum = BigInteger.ZERO ;
		int ans = 0 ;
		for(;temp.compareTo(b)<0;temp=temp.add(BigInteger.ONE)){
			BigInteger [] judge = b.divideAndRemainder(temp) ;
			if(judge[0].compareTo(judge[1])==0)
				sum = sum.add(temp) ;
		}
		System.out.println(sum.toString());
	}

}


class FastReaderR {
    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;
 
    FastReaderR(InputStream is) {
        in = is;
    }
    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }
    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan());
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
}


