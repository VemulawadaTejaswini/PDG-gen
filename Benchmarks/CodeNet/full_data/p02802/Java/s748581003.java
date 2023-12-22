    import java.util.*;


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a[][] = new long[(int)m][2];
            if(m == 0){
                System.out.println("0 0");
            }else{
                for(long i=0;i<m;i++){
                    a[(int)i][0] = sc.nextLong();
                    String wk = sc.next();
                    if(wk.equals("AC")){
                        a[(int)i][1] = (long) 0;
                    }else{
                        a[(int)i][1] = (long) 1;
                    }
                }
                System.out.println(ret(m,a));
            }
        }
        static String ret(long m, long[][] a){
            Map<Long, Long> b = new HashMap<>();
            long ac = 0;
            long wc = 0;
          	int cnt[] = new int[(int)m]; 
            for(long i=0;i<m;i++) {
              int wknum = (int)a[(int)i][0];
                if(b.containsKey(a[(int)i][0])){
                    if(b.get(a[(int)i][0]) == 1){
                        if(a[(int)i][1] == 0){
                            ac ++;
                            b.put(a[(int)i][0],a[(int)i][1]);
                            wc = wc + cnt[wknum];
                        }else{
                            cnt[wknum] ++;
                        }
                    }
                }else{
                    if(a[(int)i][1] == 0){
                        ac ++;
                    }else{
                        cnt[wknum] ++;
                    }
                    b.put(a[(int)i][0],a[(int)i][1]);
                }
            }
            String ret = Long.toString(ac) + " " + Long.toString(wc);
            return ret;
        }
    }