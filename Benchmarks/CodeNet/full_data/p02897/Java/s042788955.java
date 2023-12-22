import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double a = (double)(N/2);
        sc.close();

        if(N%2 == 0){
            System.out.println(a/(double)N);
        } else{
            System.out.println((a+1)/(double)N);
        }
    }
}