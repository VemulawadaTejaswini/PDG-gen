import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double a = 0;
if(N%2 == 0) a = 1/2;
else a = ((int)((N/2)+1))/N;
        
System.out.println(a);
    }
}