import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i=0; i<N; i++){
            int L1 = sc.nextInt();
            int L2 = sc.nextInt();
            count +=L2-L1+1;
        }

        System.out.println(count);
                  
    
    }    
}


