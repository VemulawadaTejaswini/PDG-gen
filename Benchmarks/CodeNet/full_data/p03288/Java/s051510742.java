import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        if(r > 2799){
            System.out.println("AGC");
        }else{
            if(r > 1999){
                System.out.println("ARC");
            }else{
                System.out.println("ABC");
            }
        }
        
    }
}
