import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int N  = sc.nextInt();
    double h = (double)(N-2) / (double)N;
        
    if(N % 2 == 0){
        System.out.println(0.5000000000);
    }else{
        System.out.println(h);
    }
    }
}