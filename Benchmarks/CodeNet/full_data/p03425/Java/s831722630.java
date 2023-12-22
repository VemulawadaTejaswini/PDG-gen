import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] S = new String[N];
        for(int i = 0; i < N; i++){
            S[i] = sc.next();
        }
        sc.close();
        int m = 0;
        int a = 0;
        int r = 0;
        int c = 0;
        int h = 0;
        for(int i = 0; i < N; i++){
            if(S[i].charAt(0) == 'M')
                m++;
            if(S[i].charAt(0) == 'A')
                a++;
            if(S[i].charAt(0) == 'R')
                r++;
            if(S[i].charAt(0) == 'C')
                c++;
            if(S[i].charAt(0) == 'H')
                h++;
        }
        long sum = 0;
        sum += m*a*r +
                m*a*c +
                m*a*h +
                m*r*c +
                m*r*h +
                m*c*h +
                a*r*c +
                a*r*h +
                a*c*h +
                r*c*h;

        System.out.println(sum);
    }
}