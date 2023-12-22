import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        String s = sc.next();
        String t = sc.next();
        sc.close();

        long tn = n;
        long tm = m;
        long gcf;

        while((gcf = tn % tm) != 0){
            tn = tm;
            tm = gcf;
        }

        gcf = tm;
        long min = n*m / gcf;

        boolean ans = true;

        for(int i=0; i<gcf; i++){
            if(s.charAt((int)(i * (n/gcf))) != t.charAt((int)(i * (m/gcf)))){
                ans = false;
            }
        }

        if(ans){
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}