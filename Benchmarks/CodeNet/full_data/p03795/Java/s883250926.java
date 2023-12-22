import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        if(N < 15){
            System.out.println(N*800);
        }else if(N >= 15){
            System.out.println(N*800 - (N/15)*200);
        }
    }
}
