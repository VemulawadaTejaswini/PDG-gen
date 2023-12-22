import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();
        int d = sc.nextInt();
        
        if(n == (d * 5)){
            System.out.println(3);
            return;
        }
        
        if(n <= (d * 5)){
            System.out.println(2);
            return;
        }
        

        if(n >= (d * 5)){
            System.out.println(3);
            return;
        }
        
    }
}
