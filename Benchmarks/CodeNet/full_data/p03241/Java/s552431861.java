import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
 class Main {

    public static void main(String[] args) throws IOException {
        FastR in = new FastR(System.in);
        StringBuilder st = new StringBuilder();
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList <Integer> fact = new ArrayList<>();
        for(int i=2;i*i<=m;i++) {
            if (m % i == 0) {
                fact.add(i);
                fact.add(m/i);
            }
        }
        int ans=0;
        if (n==1){

            ans =m;
        }
        else if(fact.size()==0) {
           ans =1;
        }




        else {
            Collections.sort(fact);

            for (int i = 0; i < fact.size(); i++) {
                if (fact.get(i) >= n) {
                    ans = m / fact.get(i);
                    break;
                }
            }
        }
                /*else{
                    ArrayList <Integer> sfact=new ArrayList<>();
                    boolean f = false;
                    int num = m/fact.get(i);
                    int p = fact.get(i);
                    for(int j=2;j*j<=num;j++){
                        if(num%j==0){
                            sfact.add(j);
                            sfact.add(num/j);
                        }

                    }
                    Collections.sort(sfact);
                    for(int j=0;j<sfact.size();j++)
                        if(sfact.get(j)*p<)
                    if(f)
                        break;
                }
            }
        }*/

        if(ans ==0)
            System.out.println(1);
        else
            System.out.println(ans);
    }
}

class FastR{

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastR(InputStream is) {
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
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
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

    long nextLong() throws IOException {
        int c;
        long val = 0;
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
}