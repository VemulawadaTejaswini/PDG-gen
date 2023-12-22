import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        sc.close();

        long N = A.length();
        long count = N*(N-1)/2;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(A.charAt(i)==A.charAt(j))
                    count--;
            }
        }
        System.out.println(count+1);
    }
}