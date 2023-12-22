import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] sca = S.toCharArray();
        BIT[] cnts = new BIT[26];
        for(int i=0;i<26;i++){
            cnts[i] = new BIT(N+10);
        }
        for(int i=0;i<N;i++){
            int ind = sca[i]-'a';
            cnts[ind].addTo(i + 1, 1);
        }
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++){
            int qt = sc.nextInt();
            if(qt == 1){
                int iq=sc.nextInt()-1;
                String cq=sc.next();
                int toc=cq.charAt(0)-'a';
                int fromc = sca[iq]-'a';
                if(fromc != toc) {
                    cnts[fromc].addTo(iq + 1, -1);
                    sca[iq] = cq.charAt(0);
                    cnts[toc].addTo(iq + 1, 1);
                }
            }else{
                int lq=sc.nextInt();
                int rq=sc.nextInt();
                int sum=0;
                for(int k=0;k<26;k++){
                    BIT b = cnts[k];
                    if(b.sumTo(rq)-b.sumTo(lq-1)>0){
                        sum++;
                    }
                }
                System.out.println(sum);
            }
        }


    }
    private static class BIT {
        int[] vals;
        int len;

        BIT(int n) {
            len = n;
            vals = new int[len + 1];
            Arrays.fill(vals, 0);
        }

        public void addTo(int ind, int val) {
            while (ind <= len) {
                vals[ind] += val;
                ind += ind & (-ind);
            }
        }

        public int sumTo(int ind) {
            int sum = 0;
            while (ind > 0) {
                sum += vals[ind];
                ind -= ind & (-ind);
            }
            return sum;
        }
    }
}
