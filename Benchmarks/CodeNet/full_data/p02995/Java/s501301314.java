import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        final long A = sc.nextLong();
        final long B = sc.nextLong();
        final long C = sc.nextLong();
        final long D = sc.nextLong();
        long count=B-A+1;

        count = count - (A%C == 0 ? B/C - A/C + 1 : B/C - A/C);
        count = count - (A%D == 0 ? B/D - A/D + 1 : B/D - A/D);
        long mi = Math.min(C, D);
        long ma = Math.max(C, D);
        long tmp = (ma%mi==0 ? ma/mi : ma/mi+1);
        long eps_CD = 0;
        long count_CD = 0;
        while(tmp*mi<=B){
            if((tmp*mi)%ma==0){
                if(count_CD==0){
                    eps_CD = tmp*mi;
                    count++;
                }
                else{
                    eps_CD = tmp*mi - eps_CD;
                    count = count + (A%eps_CD == 0 ? B/eps_CD - A/eps_CD + 1 : B/eps_CD- A/eps_CD);
                    break;
                }
                count_CD++;
            }
            tmp++;
        }
        System.out.println(count);
    }
}