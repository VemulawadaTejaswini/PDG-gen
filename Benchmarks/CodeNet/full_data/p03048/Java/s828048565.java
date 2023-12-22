import java.io.IOException;
import java.io.InputStream;

public class Main {

	static FastReaderR in = new FastReaderR(System.in) ;
	
	static int R,G,B,N,ans = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		R = in.nextInt() ;
		G = in.nextInt() ;
		B = in.nextInt() ;
		N = in.nextInt() ;
//		for(int i=0;i<R;i++){
//			for(int j=0;j<G;j++){
//				if((N-R-G)<=B)
//					ans++ ;
//			}
//		}
		fr() ;
		System.out.println(ans);
	}
	
	public static void fr(){
		int sum = 0 ;
		while(sum<=N){
			fg(sum) ;
			sum += R ;
		}
	}
	
	public static void fg(int sum){
		while(sum<=N){
			fb(sum) ;
			sum += G ;
		}
	}
	public static void fb(int sum){
		while(sum<=N){
			if(sum==N){
				ans++ ;
			}
			sum += B ;
		}
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

