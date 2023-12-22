import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

public class Main {
    static int n,k;
    static long ans=0;
    static int freq[];
    static long M;
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static void calc(int arr[]){
        int gcd=arr[0];
        for(int i=1;i<n;i++)
            gcd=gcd(gcd,arr[i]);
        freq[gcd]++;
        ans+=gcd;
    }
    static void recurse(int i,int arr[]){
        if(i==n){
            calc(arr);
            return;
        }

        for(int j=1;j<=k;j++) {
            arr[i] = j;
            recurse(i+1,arr);
        }
    }
    static long pow(long a,long b){
        if(b==0)
            return 1;
        long ans=pow(a,b/2);
        ans=(ans*ans)%M;
        if(b%2==1)
            ans=(ans*a)%M;
        return ans;
    }
    public static void main(String[] args)throws Exception {
        FastReader in = new FastReader(System.in);
        StringBuilder sb = new StringBuilder();
        M=1000_000_007;
        int i,j;
        n=in.nextInt();
        k=in.nextInt();
        freq=new int[k+1];
        long fr[]=new long[k+1];
        long an=0;
        for(i=k;i>=1;i--){
            long z=pow(k/i,n);
            for(j=i+i;j<=k;j+=i){
                z=(z-fr[j]+M)%M;
            }
            fr[i]=z;
        }
        for(i=1;i<=k;i++){
            an=(an+fr[i]*i)%M;
        }
        /*recurse(0,new int[n]);
        for(i=1;i<=k;i++)
            System.out.println(i+"->"+freq[i]);*/
        System.out.println(an);

    }
}

class FastReader {

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastReader(InputStream is) {
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

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}



