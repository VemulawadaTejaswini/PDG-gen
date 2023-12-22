import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int N = stdIn.nextInt();
        int A = stdIn.nextInt();
        int answer = N^2-A;
        
        System.out.print(answer);
               
    }
    
}
