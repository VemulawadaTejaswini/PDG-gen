import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if(A>B || (N == 1 && A!=B))
            System.out.println(0);
        else
            System.out.println(B*(N-1)+A - A*(N-1)-B+1);
    }
}