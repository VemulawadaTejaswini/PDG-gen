import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = 0;

        while(N>10){      
        H += N%10;
        N /= 10; 
        }

        if(N%H==0)
        System.out.println("Yes");
        else
        System.out.println("No");
                  
    
    }    
}


