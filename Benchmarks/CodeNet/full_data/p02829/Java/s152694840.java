import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        if((a == 1 && b == 2) || (a == 2 && b == 1)){
            System.out.println(3);
        }else if((a == 1 && b == 3) || (a == 3 && b == 1)){
            System.out.println(2);
        }else{
            System.out.println(1);
        }
    }
}