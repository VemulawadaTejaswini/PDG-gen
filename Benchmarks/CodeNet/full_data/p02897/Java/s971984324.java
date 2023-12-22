import java.util.*;


public class Main{
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.print("0.5000000000");
        }else if(n == 1){
            System.out.print("1.0000000");
        }else{
            int c = n/2;
            double s = (double)c/n;
            System.out.print(String.format("%.10f", s));
        }
        
    }
}