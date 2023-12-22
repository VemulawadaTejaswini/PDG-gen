import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        sc.close();

        int max = 0;

        for(int i = 0; i < N; i++){
            if(s.substring(i).equals(t.substring(0, N-i)))
                max = Math.max(max, s.substring(i).length());
        }

        System.out.println(2*N-max);
    }
}