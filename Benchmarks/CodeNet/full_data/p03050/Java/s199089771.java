import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        long N=Long.parseLong(str);
        long M = 0;
        for (long i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){
                if((N-i)%i==0 && (N-i)/i > 1){
                    M += (N-i)/i;
                }
            }
            if(i==1)continue;
            long tmp = N/i;
            if(N%tmp==0){
                if((N-tmp)%tmp==0 && (N-tmp)/tmp > 1){
                    M += (N-tmp)/tmp;
                }
            }
        }
        System.out.println(M);
    }
}