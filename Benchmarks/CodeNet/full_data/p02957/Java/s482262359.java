import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        
        int i = (a + b)/ 2;
        
        if(i % 2 == 0){
            System.out.println(i);
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }
}
