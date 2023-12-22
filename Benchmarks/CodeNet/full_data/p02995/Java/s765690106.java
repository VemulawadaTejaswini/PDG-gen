import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long min = Math.min(C, D);
        long max = Math.max(C, D);
        long E = 0;
        if(A==B && A%C==0 && A%D==0){
            System.out.println(0);
            return;
        }
        if(C==D && C==1){
            System.out.println(0);
            return;
        }

        for(int i=0; i<=60; i++){
            if(max%min==0){
                E = min;
                E = C * D / E;
                break;
            }
            long x = min;
            long y = max % min;
            max = x;
            min = y;
        }
        System.out.println((B - A + 1) - (B / C - (A - 1) / C + B / D - (A - 1) / D - (B / E - A / E)));
    }
}